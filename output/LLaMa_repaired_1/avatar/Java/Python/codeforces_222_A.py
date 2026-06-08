import sys

n, k = map(int, input().split())
l = 0
c = 1

for _ in range(n):
    numbers = list(map(int, input().split()))
    a = numbers[0]
    if a == l:
        c += 1
    else:
        c = 1
    l = a

if c + k > n:
    print(n - c)
else:
    print(-1)