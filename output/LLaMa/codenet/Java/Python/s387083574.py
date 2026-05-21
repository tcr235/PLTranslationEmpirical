from functools import cmp_to_key
from typing import Dict

def main():
    N = int(input())
    map = {}
    for i in range(1, N + 1):
        map[i] = int(input())

    sorted_keys = sorted(map, key=cmp_to_key(lambda x, y: map[y] - map[x]))
    print(" ".join(map(str, sorted_keys)))

if __name__ == "__main__":
    main()