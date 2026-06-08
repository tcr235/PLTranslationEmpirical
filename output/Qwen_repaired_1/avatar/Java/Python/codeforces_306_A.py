n, m = map(int, input().split())
a = [n // m] * m

if n % m != 0:
    sub = n // m
    test = n - (sub * m)
    
    for _ in range(test):
        a[_ % len(a)] += 1

for i in reversed(range(len(a))):
    print(a[i], end=" ")