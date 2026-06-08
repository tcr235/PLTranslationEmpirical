from decimal import Decimal, getcontext

N, d, x = map(Decimal, input().split())

getcontext().prec = 50
ans = Decimal(0.0)

while float(N) > 0.5:
    adnum = Decimal(d + x * (N - 0.5))
    ans += adnum
    d = (N + 1.0) * d / N + (5.0 * x) / (2.0 * N)
    x = (1.0 + (2.0 / N)) * x
    N -= 1

print(ans)