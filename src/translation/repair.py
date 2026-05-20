import os
import re
import logging
import json
import argparse
from pathlib import Path
from dotenv import load_dotenv
from tqdm import tqdm

from hf_api import generate, MODEL_IDS


def extract_code(response: str, target_lang: str) -> str:
    """Strip markdown fences that chat models add around code blocks."""
    lang_tag = target_lang.lower()
    pattern = rf"```(?:{lang_tag})?\s*\n?(.*?)```"
    match = re.search(pattern, response, re.DOTALL | re.IGNORECASE)
    if match:
        return match.group(1).strip()
    return response.strip()


os.makedirs('logs', exist_ok=True)
logging.basicConfig(
    filename='logs/repair.log',
    level=logging.INFO,
    format='%(asctime)s %(levelname)s %(module)s - %(funcName)s: %(message)s',
    datefmt='%Y-%m-%d %H:%M:%S',
)

EXTENSIONS = {
    "Java":   "java",
    "Python": "py",
    "C":      "c",
    "C++":    "cpp",
    "Go":     "go",
}


def build_repair_prompt(
    model: str,
    dataset: str,
    error_type: str,
    source: str,
    target: str,
    source_code: str,
    translated_code: str,
    stderr: str,
    test_inputs: str,
    test_outputs: str,
    generated: str,
) -> str:
    if error_type in ('compile', 'runtime') and dataset == 'evalplus':
        content = (
            f"You were asked to translate the following {source} code to {target}:\n\n{source_code}\n\n"
            f"Your response was the following {target} code:\n\n{translated_code}\n\n"
            f"Executing your generated code gives the following error because it is syntactically incorrect:\n\n{stderr}\n\n"
            f"Can you re-generate your response and translate the above {source} code to {target}. "
            f"Do not add any natural language description in your response, and do not change the method signature from incorrect translation.\n\n"
            f"{target} Code:\n"
        )
    elif error_type in ('compile', 'runtime'):
        content = (
            f"You were asked to translate the following {source} code to {target}:\n\n{source_code}\n\n"
            f"Your response was the following {target} code:\n\n{translated_code}\n\n"
            f"Executing your generated code gives the following error because it is syntactically incorrect:\n\n{stderr}\n\n"
            f"Can you re-generate your response and translate the above {source} code to {target}. "
            f"Do not add any natural language description in your response.\n\n"
            f"{target} Code:\n"
        )
    elif error_type == 'incorrect' and dataset == 'evalplus':
        content = (
            f"You were asked to translate the following {source} code to {target}:\n\n{source_code}\n\n"
            f"Your response was the following {target} code:\n\n{translated_code}\n\n"
            f"Executing your generated code gives the following test failure:\n\n{stderr}\n\n"
            f"Can you re-generate your response and translate the above {source} code to {target}. "
            f"Do not add any natural language description in your output, and do not change the method signature from incorrect translation.\n\n"
            f"{target} Code:\n"
        )
    else:  # incorrect on codenet/avatar
        content = (
            f"You were asked to translate the following {source} code to {target}:\n\n{source_code}\n\n"
            f"Your response was the following {target} code:\n\n{translated_code}\n\n"
            f"Executing your generated code gives the following output:\n{generated}\n\n"
            f"instead of the following expected output:\n{test_outputs}\n\n"
            f"Can you re-generate your response and translate the above {source} code to {target}. "
            f"Do not add any natural language description in your response. "
            f"Your generated {target} code should take the following input and generate the expected output:\n\n"
            f"Input:\n{test_inputs}\n\nExpected Output:\n{test_outputs}\n\n"
            f"{target} Code:\n"
        )

    if model == 'StarCoder':
        content = f"<fim_prefix>{content}<fim_suffix><fim_middle>"

    return content


class Repair:

    def __init__(self, args) -> None:
        self.args = args

    def __enter__(self):
        self.main_dir      = os.getcwd()
        self.translation_dir = Path(self.main_dir) / 'output' / self.args.model / self.args.dataset
        self.input_dir       = Path(self.main_dir) / 'dataset' / self.args.dataset

        if not self.input_dir.exists():
            raise FileNotFoundError(f"Directory {self.input_dir} does not exist.")

        self.out_dir = (
            Path(self.main_dir)
            / 'output'
            / f'{self.args.model}_IO_{self.args.attempt}'
            / self.args.dataset
        )
        self.out_dir.mkdir(parents=True, exist_ok=True)
        return self

    def fix(self, source: str, target: str):
        errors_path = (
            Path('fix_reports')
            / f'{self.args.model}_{self.args.dataset}_errors_from_{source}_to_{target}_{self.args.attempt}.json'
        )
        with open(errors_path, 'r') as f:
            errors = json.load(f)

        snippets = errors[self.args.error_type]
        print(f'Repairing {len(snippets)} {self.args.error_type} errors...')

        for snippet in tqdm(snippets, bar_format="{desc:<5.5}{percentage:3.0f}%|{bar:10}{r_bar}"):
            code_id = snippet[0].split('.')[0]

            stderr, test_inputs, test_outputs, generated = '', '', '', ''
            if self.args.error_type in ('compile', 'runtime'):
                filename, stderr = snippet
            elif self.args.error_type == 'incorrect' and self.args.dataset == 'evalplus':
                filename, stderr = snippet
            else:
                filename, test_inputs, test_outputs, generated = snippet

            # Output file path
            target_dir = self.out_dir / source / target
            target_dir.mkdir(parents=True, exist_ok=True)
            out_fp = target_dir / filename

            if out_fp.exists():
                continue

            # Read original source code
            src_ext = EXTENSIONS[source]
            src_file = self.input_dir / source / 'Code' / f'{code_id}.{src_ext}'
            with open(src_file, 'r') as f:
                source_code = f.read().strip()

            # Read the most-recent (failed) translation
            recent_fp = self.translation_dir / source / target / filename
            with open(recent_fp, 'r') as f:
                recent_translated_code = f.read().strip()

            prompt = build_repair_prompt(
                model          = self.args.model,
                dataset        = self.args.dataset,
                error_type     = self.args.error_type,
                source         = source,
                target         = target,
                source_code    = source_code,
                translated_code= recent_translated_code,
                stderr         = stderr.strip(),
                test_inputs    = test_inputs.strip(),
                test_outputs   = test_outputs.strip(),
                generated      = generated.strip(),
            )

            try:
                raw = generate(self.args.model, prompt, max_new_tokens=512)
                repaired = extract_code(raw, target)
                # Keep Java public class name consistent with the filename
                repaired = re.sub(
                    r'public\s+class\s+\S+',
                    f'public class {code_id}',
                    repaired,
                )
                with open(out_fp, 'w') as f:
                    f.write(repaired)

            except Exception as exc:
                logging.error('Repair failed for %s: %s', filename, exc)
                print(f'[ERROR] Skipping repair of {filename}: {exc}')
                with open(out_fp, 'w') as f:
                    f.write(f'# Repair failed: {exc}\n')

    def __exit__(self, exc_type, exc_val, exc_tb):
        if exc_type:
            logging.error('Repair session ended with exception: %s', exc_val)


if __name__ == '__main__':
    load_dotenv()

    parser = argparse.ArgumentParser(
        description='Repair failed translations via HF Inference API (serverless).'
    )
    parser.add_argument('--model',       required=True, type=str,
                        help=f'Model name. Supported: {list(MODEL_IDS.keys())}')
    parser.add_argument('--dataset',     required=True, type=str,
                        help='Dataset: codenet or avatar')
    parser.add_argument('--source_lang', required=True, type=str)
    parser.add_argument('--target_lang', required=True, type=str)
    parser.add_argument('--error_type',  required=True, type=str,
                        help='Error type to repair: compile, runtime, or incorrect')
    parser.add_argument('--attempt',     required=True, type=int,
                        help='Attempt number (used in filenames)')
    parser.add_argument('--max_new_tokens', default=512, type=int)
    args = parser.parse_args()

    source = args.source_lang
    target = args.target_lang

    with Repair(args) as repair:
        logging.info(
            'Repairing %s -> %s in %s dataset for %s errors using %s.',
            source, target, args.dataset, args.error_type, args.model,
        )
        repair.fix(source, target)
