from math import comb
from functools import reduce

def multiply_list(lst):
    return reduce(lambda x, y: x * y, lst)

n = int(input())
p = int(input())
k0 = 0
k1 = 0

for _ in range(n):
    x = int(input())
    if x % 2 == 1:
        k1 += 1
    else:
        k0 += 1

ans = 2 ** k0

if p == 0:
    add = 0
    for i in range(0, k1 + 1, 2):
        add += comb(k1, i)
    ans *= add
else:
    add = 0
    for i in range(1, k1 + 1, 2):
        add += comb(k1, i)
    ans *= add

print(ans)