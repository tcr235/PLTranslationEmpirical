import os
import re
import logging
from dotenv import load_dotenv
import argparse
from tqdm import tqdm

from hf_api import generate, MODEL_IDS


os.makedirs('logs', exist_ok=True)
logging.basicConfig(
    filename='logs/translation.log',
    level=logging.INFO,
    format='%(asctime)s %(levelname)s %(module)s - %(funcName)s: %(message)s',
    datefmt='%Y-%m-%d %H:%M:%S',
)


def build_prompt(source_lang: str, target_lang: str, source_code: str) -> str:
    return (
        f"{source_lang} Code:\n\n{source_code}"
        f"\n\nTranslate the above {source_lang} code to {target_lang}. "
        f"Return ONLY the {target_lang} code with no explanation."
    )


def extract_code(response: str, target_lang: str) -> str:
    """Strip markdown fences that chat models add around code blocks."""
    lang_tag = target_lang.lower()
    # Match ```java ... ``` or ``` ... ```
    pattern = rf"```(?:{lang_tag})?\s*\n?(.*?)```"
    match = re.search(pattern, response, re.DOTALL | re.IGNORECASE)
    if match:
        return match.group(1).strip()
    # No fences found — return as-is (model may have obeyed the instruction)
    return response.strip()


def main(args):
    extensions = {'Python': 'py', 'Java': 'java'}

    in_folder  = f'dataset/{args.dataset}/{args.source_lang}/Code'
    out_folder = f'output/{args.model}/{args.dataset}/{args.source_lang}/{args.target_lang}'

    in_files = os.listdir(in_folder)
    print(f'Found {len(in_files)} input files.')

    # Skip files already translated (non-empty output file present)
    if os.path.exists(out_folder):
        done = {
            x.split('.')[0]
            for x in os.listdir(out_folder)
            if os.stat(f'{out_folder}/{x}').st_size != 0
        }
        if done:
            in_files = [f for f in in_files if f.split('.')[0] not in done]
    print(f'Translating {len(in_files)} files (skipping already-done).')

    ext = extensions[args.target_lang]
    os.makedirs(out_folder, exist_ok=True)

    for fname in tqdm(in_files):
        prompt_file = f'{in_folder}/{fname}'

        with open(prompt_file, 'r', encoding='ISO-8859-1', errors='ignore') as fin:
            source_code = fin.read()

        prompt = build_prompt(args.source_lang, args.target_lang, source_code)
        out_file = f'{out_folder}/{fname.split(".")[0]}.{ext}'

        try:
            raw = generate(args.model, prompt, max_new_tokens=args.max_new_tokens)
            generated = extract_code(raw, args.target_lang)
            with open(out_file, 'w') as fout:
                fout.write(generated)

        except Exception as exc:
            logging.error('Failed on %s: %s', fname, exc)
            print(f'[ERROR] Skipping {fname}: {exc}')
            # Write a sentinel so the file is not retried as "empty"
            with open(out_file, 'w') as fout:
                fout.write(f'# Translation failed: {exc}\n')
            continue


if __name__ == '__main__':
    load_dotenv()

    parser = argparse.ArgumentParser(
        description='Translate code via HF Inference API (serverless).'
    )
    parser.add_argument('--model',       required=True, type=str,
                        help=f'Model name. Supported: {list(MODEL_IDS.keys())}')
    parser.add_argument('--dataset',     required=True, type=str,
                        help='Dataset name: codenet or avatar')
    parser.add_argument('--source_lang', required=True, type=str,
                        help='Source language: Python or Java')
    parser.add_argument('--target_lang', required=True, type=str,
                        help='Target language: Python or Java')
    parser.add_argument('--max_new_tokens', default=512, type=int,
                        help='Max tokens to generate (default: 512)')
    args = parser.parse_args()

    logging.info(
        'Translating %s -> %s with %s on %s',
        args.source_lang, args.target_lang, args.model, args.dataset,
    )
    main(args)
