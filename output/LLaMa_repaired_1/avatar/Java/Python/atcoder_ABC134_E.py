from typing import Dict
import sys

def main():
    n = int(input())
    map: Dict[int, int] = {}

    while n > 0:
        num = int(input())
        if not map or (list(map.keys())[-1] if map else float('-inf')) < num:
            map[num] = map.get(num, 0) + 1
        else:
            key = max((k for k in map if k < num), default=None)
            if key is None:
                map[num] = map.get(num, 0) + 1
                continue
            val = map[key]
            if val == 1:
                del map[key]
            else:
                map[key] -= 1
            map[num] = map.get(num, 0) + 1
        n -= 1

    ans = sum(map.values())
    print(ans)

if __name__ == "__main__":
    main()