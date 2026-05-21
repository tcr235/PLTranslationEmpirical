from decimal import Decimal, getcontext
import math

N = float(input())
d = float(input())
x = float(input())

getcontext().prec = 20
ans = Decimal(0.0)
while N > 0.5:
    adnum = Decimal(d + x * (N - 0.5))
    ans += adnum
    d = (N + 1.0) * d / N + (5.0 * x) / (2.0 * N)
    x = (1.0 + (2.0 / N)) * x
    N -= 1

print("{:.20f}".format(ans))