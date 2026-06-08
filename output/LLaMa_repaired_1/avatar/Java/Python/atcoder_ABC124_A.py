import sys

def atcoder_ABC124_A():
    a, b = map(int, sys.stdin.readline().split())

    sum = 0
    for _ in range(2):
        if a >= b:
            sum += a
            a -= 1
        else:
            sum += b
            b -= 1

    print(sum)

atcoder_ABC124_A()