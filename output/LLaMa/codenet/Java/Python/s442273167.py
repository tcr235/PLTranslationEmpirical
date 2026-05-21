import sys

n = int(input())
l = [0] * n
r = [0] * n

for i in range(n):
    l[i], r[i] = map(int, input().split())

sum = sum((r[i] - l[i] + 1) for i in range(n))

print(sum)