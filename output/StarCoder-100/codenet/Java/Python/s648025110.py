import sys

n = int(raw_input().strip())
h = map(int, raw_input().strip().split(' '))

ans = 0
out = 0

for i in range(n):
    if out < h[i]:
        ans += h[i] - out
        out =  h[i]
    else:
        out = h[i]

print ans

