import math
import sys

def mod_inv(a, m):
    return pow(a, m-2, m)

def mod_pow(a, b, m):
    ans = 1
    x = a % m
    while b!= 0:
        if b & 1:
            ans = (ans * x) % m
        x = (x * x) % m
        b >>= 1
    return ans

def lcm(a, b):
    return (a * b) // math.gcd(a, b)

def main():
    input = sys.stdin.readline
    MOD = 10**9 + 7
    N = int(input())
    A = list(map(int, input().split()))
    lcm_val = 1
    for ai in A:
        lcm_val = lcm(lcm_val, ai)
    ans = 0
    for ai in A:
        ans = (ans + mod_div(lcm_val, ai, MOD)) % MOD
    print(ans)

def mod_div(a, b, m):
    return (a % m) * mod_inv(b, m) % m

if __name__ == '__main__':
    main()

