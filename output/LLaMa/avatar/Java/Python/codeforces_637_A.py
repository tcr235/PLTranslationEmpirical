import sys
from collections import defaultdict, HashMap

def debug(obj):
    print(str(obj))

def main():
    n = int(input())
    ara = list(map(int, input().split()))
    map_ = defaultdict(int)
    for v in ara:
        map_[v] += 1
        max_count = max(map_.values())
    
    mm = defaultdict(int)
    for v in ara:
        if mm[v] == 0 and mm[v] != max_count:
            mm[v] += 1
            if mm[v] == max_count:
                print(v)
                break
        else:
            mm[v] += 1
            if mm[v] == max_count:
                print(v)
                break

if __name__ == "__main__":
    main()