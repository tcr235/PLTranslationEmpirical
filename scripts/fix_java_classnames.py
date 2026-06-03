"""
Renames the public class declaration in every generated Java file so that
it matches the filename, as required by the Java compiler.

Example: file s000375264.java containing "public class Main {"
         becomes "public class s000375264 {"

Usage:
    python3 scripts/fix_java_classnames.py [--dry-run]

With --dry-run, prints what would be changed without touching any file.
"""

import os
import re
import argparse

OUTPUT_ROOT = "output"


def fix_file(path: str, dry_run: bool) -> bool:
    """Returns True if the file was (or would be) modified."""
    expected_class = os.path.basename(path).removesuffix(".java")

    with open(path, "r", encoding="utf-8", errors="ignore") as f:
        original = f.read()

    # Match "public class AnyName" (with or without trailing brace/whitespace)
    pattern = r"public\s+class\s+(\w+)"
    match = re.search(pattern, original)

    if not match:
        return False

    current_class = match.group(1)
    if current_class == expected_class:
        return False

    fixed = re.sub(pattern, f"public class {expected_class}", original)

    if dry_run:
        print(f"[DRY-RUN] {path}: '{current_class}' -> '{expected_class}'")
    else:
        with open(path, "w", encoding="utf-8") as f:
            f.write(fixed)

    return True


def main(dry_run: bool):
    total = changed = 0

    for root, _, files in os.walk(OUTPUT_ROOT):
        for fname in files:
            if not fname.endswith(".java"):
                continue
            path = os.path.join(root, fname)
            total += 1
            if fix_file(path, dry_run):
                changed += 1

    label = "Would change" if dry_run else "Changed"
    print(f"\n{label} {changed}/{total} Java files.")


if __name__ == "__main__":
    parser = argparse.ArgumentParser(description="Fix Java public class names to match filenames.")
    parser.add_argument("--dry-run", action="store_true", help="Preview changes without writing files.")
    args = parser.parse_args()
    main(args.dry_run)
