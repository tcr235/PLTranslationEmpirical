import os
import time
import logging
from huggingface_hub import InferenceClient

logger = logging.getLogger(__name__)

# HF serverless API has per-minute rate limits on the free tier.
# On HTTP 429 we back off exponentially before retrying.
_INITIAL_BACKOFF  = 60   # seconds to wait after the first 429
_MAX_BACKOFF      = 300  # cap for exponential back-off
_MAX_RETRIES      = 6    # give up after this many 429s in a row

# Polite delay between every successful request to stay well under the limit.
# Free tier allows ~10 req/min; 8s gives ~7 req/min with room to spare.
INTER_REQUEST_DELAY = 8  # seconds

# Original paper used bigcode/starcoder and meta-llama/Llama-2-13b-chat-hf,
# but both were removed from the HF serverless API.
# These are their closest current equivalents available on the free tier.
MODEL_IDS = {
    "LLaMa":     "meta-llama/Llama-3.1-8B-Instruct",
    "StarCoder":  "Qwen/Qwen2.5-Coder-7B-Instruct",
}

AUTH_TOKENS = {
    "LLaMa":     "LLAMA2_AUTH_TOKEN",
    "StarCoder":  "STARCODER_AUTH_TOKEN",
}


def _get_client(model_name: str) -> InferenceClient:
    env_var = AUTH_TOKENS[model_name]
    token = os.environ.get(env_var)
    if not token:
        raise EnvironmentError(
            f"Environment variable {env_var} is not set. "
            "Check your .env file."
        )
    # No explicit provider: huggingface_hub >= 0.27 auto-routes to whichever
    # provider currently hosts the model on the free serverless tier.
    return InferenceClient(model=MODEL_IDS[model_name], token=token)


def generate(model_name: str, prompt: str, max_new_tokens: int = 512) -> str:
    """
    Send a chat-completion request to the HF Inference API and return only
    the generated text.  Retries automatically on HTTP 429 (rate limit) and
    transient server errors.
    """
    client = _get_client(model_name)

    backoff = _INITIAL_BACKOFF
    for attempt in range(1, _MAX_RETRIES + 1):
        try:
            response = client.chat_completion(
                messages=[{"role": "user", "content": prompt}],
                max_tokens=max_new_tokens,
            )
            generated_text = response.choices[0].message.content
            time.sleep(INTER_REQUEST_DELAY)
            return generated_text

        except Exception as exc:
            err = str(exc)
            is_rate_limit = "429" in err or "rate limit" in err.lower()
            is_server_err = any(code in err for code in ("500", "503", "502"))

            if is_rate_limit:
                logger.warning(
                    "Rate limit hit (attempt %d/%d). Waiting %ds before retry.",
                    attempt, _MAX_RETRIES, backoff,
                )
                print(
                    f"[HF API] Rate limit (429). Sleeping {backoff}s "
                    f"(attempt {attempt}/{_MAX_RETRIES})..."
                )
                time.sleep(backoff)
                backoff = min(backoff * 2, _MAX_BACKOFF)

            elif is_server_err:
                logger.warning(
                    "Server error on attempt %d/%d: %s. Retrying in 30s.",
                    attempt, _MAX_RETRIES, err,
                )
                print(f"[HF API] Server error. Sleeping 30s before retry...")
                time.sleep(30)

            else:
                logger.error("Unrecoverable HF API error: %s", err)
                raise

    raise RuntimeError(
        f"HF API for {model_name} failed after {_MAX_RETRIES} retries."
    )
