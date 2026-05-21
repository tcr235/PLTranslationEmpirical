from sys import stdin

def codeforces_519_B():
    n = int(stdin.readline())
    a, b, c = 0, 0, 0
    for _ in range(n):
        a += int(stdin.readline())
    for _ in range(n - 1):
        b += int(stdin.readline())
    for _ in range(n - 2):
        c += int(stdin.readline())
    x = a - b
    y = b - c
    print(x)
    print(y)

codeforces_519_B()