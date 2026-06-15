import decimal

def atcoder_AGC007_C(N, d, x):
    ans = decimal.Decimal('0.0')
    while N > 0.5:
        adnum = decimal.Decimal(d + x * (N - 0.5))
        ans = ans + adnum
        d = (N + 1.0) * d / N + (5.0 * x) / (2.0 * N)
        x = (1.0 + (2.0 / N)) * x
        N -= 1
    return ans

