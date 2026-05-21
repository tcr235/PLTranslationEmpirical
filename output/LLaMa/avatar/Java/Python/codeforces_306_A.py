import sys

n, m = map(int, input().split())
a = [0] * m

if n % m == 0:
    a = [n // m] * m
else:
    sub = n // m
    a = [sub] * m
    test = n - (sub * m)
    count = 0
    for _ in range(test):
        a[count] += 1
        count = (count + 1) % len(a)

print(*a[::-1])