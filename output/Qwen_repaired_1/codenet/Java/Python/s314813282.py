import sys

def max_int(x, a):
    bignum = x
    for num in a:
        bignum = max(bignum, num)
    return bignum

def min_int(y, b):
    smallnum = y
    for num in b:
        smallnum = min(smallnum, num)
    return smallnum

def check_war(a, b):
    if a >= b:
        print("War")
    else:
        print("No War")

inputs = sys.stdin.read().split()
index = 0

m = int(inputs[index])
index += 1

n = int(inputs[index])
index += 1

x = int(inputs[index])
index += 1

y = int(inputs[index])
index += 1

a = [int(inputs[index]) for _ in range(m)]
for _ in range(m):
    index += 1

b = [int(inputs[index]) for _ in range(n)]
for _ in range(n):
    index += 1

x_max = max_int(x, a)
y_min = min_int(y, b)

check_war(x_max, y_min)