import decimal

N = int(input().split()[0])
d = int(input().split()[1])
x = int(input().split()[2])

ans = decimal.Decimal("0.0")
while N > 0.5:
    adnum = decimal.Decimal(str(d) + "." + str(x * (N - 0.5)))
    ans += adnum
    d = (N + 1.0) * d / N + (5.0 * x) / (2.0 * N)
    x = (1.0 + (2.0 / N)) * x
    N -= 1

print(f"{ans:.20f}")