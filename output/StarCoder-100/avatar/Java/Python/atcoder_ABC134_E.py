import sys
from collections import defaultdict

n = int(input())

d = defaultdict(int)

for i in range(n):
    num = int(input())
    if d[num] == 0:
        d[num] += 1
    else:
        key = d.bisect_left(num)
        val = d[key]
        if val == 1:
            d.pop(key)
        else:
            d[key] -= 1
        d[num] += 1

ans = 0
for key in d.keys():
    ans += d[key]

print(ans)

