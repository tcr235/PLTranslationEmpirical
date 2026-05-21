from math import gcd
from functools import reduce

def main():
    n = int(input())
    a = list(map(int, input().split()))
    
    lcm = reduce(lambda x, y: x*y // gcd(x, y), a)
    
    mod = 10**9 + 7
    mod_lcm = lcm % mod
    
    ans = 0
    for ai in a:
        ans = (ans + powermod(mod_lcm, mod - ai - 1, mod)) % mod
        
    print(ans)

def powermod(base, exp, mod):
    result = 1
    base = base % mod
    while exp > 0:
        if exp % 2 == 1:
            result = (result * base) % mod
        exp = exp >> 1
        base = (base * base) % mod
    return result

if __name__ == "__main__":
    main()