import sys

n = int(input())
d = 0

for _ in range(n):
    if int(input()) % 2 == 0:
        d += 1

print("YES" if d % 2 == 0 else "NO")