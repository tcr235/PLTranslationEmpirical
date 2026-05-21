import math
from functools import reduce

def modDiv(a, b, mod):
    return (a % mod) * pow(b, -1, mod) % mod

def modInv(x, mod):
    return pow(x, mod - 2, mod)

def modPow(b, e, mod):
    ans = 1
    x = b % mod
    for y in range(e.bit_length(), -1, -1):
        if (e >> y) & 1:
            ans = (ans * x) % mod
        x = (x * x) % mod
    return ans

def main():
    N = int(input())
    A = list(map(int, input().split()))

    lcm = 1
    for ai in A:
        lcm = lcm * ai // math.gcd(lcm, ai)

    mod = 10**9 + 7
    modLcm = lcm % mod

    ans = 0
    for ai in A:
        ans = (ans + modDiv(modLcm, ai, mod)) % mod

    print(ans)

if __name__ == "__main__":
    main()