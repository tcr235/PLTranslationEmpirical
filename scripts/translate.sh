WORKDIR=`pwd`
export PYTHONPATH=$WORKDIR;
export PYTHONIOENCODING=utf-8;

function prompt() {
    echo;
    echo "Syntax: bash scripts/translate.sh MODEL DATASET SRC_LANG TRG_LANG [MAX_NEW_TOKENS]";
    echo "MODEL:          LLaMa or StarCoder";
    echo "DATASET:        codenet or avatar";
    echo "SRC_LANG:       source language (Python or Java)";
    echo "TRG_LANG:       target language (Python or Java)";
    echo "MAX_NEW_TOKENS: max tokens to generate (default: 512)";
    exit;
}

while getopts ":h" option; do
    case $option in
        h) prompt;;
    esac
done

if [[ $# -lt 4 ]]; then
  prompt;
fi

MODEL=$1;
DATASET=$2;
SRC_LANG=$3;
TRG_LANG=$4;
MAX_NEW_TOKENS=${5:-512};

if [[ $MODEL == "StarCoder" || $MODEL == "LLaMa" ]]; then
  python3 src/translation/translate_open_source.py \
    --model $MODEL \
    --dataset $DATASET \
    --source_lang $SRC_LANG \
    --target_lang $TRG_LANG \
    --max_new_tokens $MAX_NEW_TOKENS;
else
  echo "Model not supported. Use: StarCoder or LLaMa";
fi
