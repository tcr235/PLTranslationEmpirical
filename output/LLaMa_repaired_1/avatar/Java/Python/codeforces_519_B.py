from sys import stdin

def codeforces_519_B():
    n = int(stdin.readline())
    a, b, c = 0, 0, 0
    next_line = stdin.readline()
    for _ in range(n):
        line = stdin.readline()
        values = [int(x) for x in line.strip().split()]
        a += sum(values)
    for _ in range(n - 1):
        line = stdin.readline()
        values = [int(x) for x in line.strip().split()]
        b += sum(values)
    for _ in range(n - 2):
        line = stdin.readline()
        values = [int(x) for x in line.strip().split()]
        c += sum(values)
    x = a - b
    y = b - c
    print(x)
    print(y)

codeforces_519_B()