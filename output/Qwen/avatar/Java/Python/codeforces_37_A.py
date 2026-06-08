import sys
from collections import Counter

input = sys.stdin.read
data = input().split()

n = int(data[0])
values = list(map(int, data[1:]))

count = Counter(values)
max_count = max(count.values())

print(f"{max_count} {len(count)}")