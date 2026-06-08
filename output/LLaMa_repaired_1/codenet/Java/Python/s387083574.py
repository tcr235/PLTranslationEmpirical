from typing import Dict
import sys

def main():
    N = int(input())
    map: Dict[int, int] = {}
    scanner = sys.stdin
    for _ in range(N):
        line = scanner.readline().split()
        num = int(line[0])
        map[num] = int(line[1])

    sorted_keys = sorted(map, key=lambda x: map[x], reverse=True)
    print(" ".join(map(str, sorted_keys)))

if __name__ == "__main__":
    main()