def atcoder_ABC152_E(N):
    A = [int(i) for i in input().split()]
    lcm = 1
    for ai in A:
        a = int(ai)
        lcm = lcm * a // gcd(a, lcm)
    mod = 1000000007
    modLcm = lcm % mod
    ans = 0
    for ai in A:
        ans = (ans + modDiv(modLcm, ai, mod)) % mod
    print(ans)

def modDiv(a, b, mod):
    return (a % mod) * modInv(b, mod) % mod

def modInv(x, mod):
    return pow(x, mod - 2, mod)

def pow(b, e, mod):
    ans = 1
    x = b % mod
    for y in range(e):
        if y & 1:
            ans = (ans * x) % mod
            x = (x * x) % mod
    return ans

