import sys

N = int(input())

d = {}

for i in range(1, N + 1):
    d[i] = int(input())

print(*sorted(d, key=d.get), sep=' ')
