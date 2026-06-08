```python
from typing import List, Tuple

INF = float('inf') / 2
MOD = 1_000_000_007
SIZE = 1_000_000
fac = [0] * SIZE
inv = [0] * SIZE
finv = [0] * SIZE

def gcd(a: int, b: int) -> int:
    if b == 0:
        return a
    return gcd(b, a % b)

def lcm(a: int, b: int) -> int:
    return a * b // gcd(a, b)

def inv(a: int) -> int:
    return pow(a, MOD - 2, MOD)

def pow(a: int, r: int) -> int:
    result = 1
    while r > 0:
        if r & 1:
            result = result * a % MOD
        a = a * a % MOD
        r >>= 1
    return result

def mod_fact(n: int) -> int:
    if n == 0:
        return 1
    return n * mod_fact(n - 1) % MOD

def fact(n: int) -> int:
    if n == 0:
        return 1
    return n * fact(n - 1)

def init_comb():
    global fac, inv, finv
    fac[0] = fac[1] = inv[1] = finv[0] = finv[1] = 1
    for i in range(2, SIZE):
        fac[i] = fac[i - 1] * i % MOD
        inv[i] = MOD - inv[MOD % i] * (MOD // i) % MOD
        finv[i] = finv[i - 1] * inv[i] % MOD

def mod_comb(n: int, r: int) -> int:
    global fac, finv
    if n < r or n < 0 or r < 0:
        return 0
    return fac[n] * finv[r] % MOD * finv[n - r] % MOD

def comb(n: int, r: int) -> int:
    result = 1
    for i in range(1, r + 1):
        result = result * (n - i + 1) // i
    return result

def is_prime