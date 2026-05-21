import sys

def modinv(a, mod):
    b, u, v = mod, 1, 0
    while b:
        t = a // b
        a, b = b, a - t * b
        u, v = v, u - t * v
    u %= mod
    if u < 0:
        u += mod
    return u

def solve():
    input = sys.stdin.read
    data = input().split()
    n = int(data[0])
    a = list(map(int, data[1:]))
    
    mod = 1_000_000_007
    p = 1
    for i in range(2, n + 1):
        p = p * i % mod
    
    q = [0] * n
    q[0] = 1
    for i in range(1, n):
        q[i] = (q[i - 1] + modinv(i + 1, mod)) % mod
    
    ans = 0
    for i in range(n):
        val = (q[i] + q[n - i - 1] - 1) % mod
        val = val * a[i] % mod
        val = val * p % mod
        ans += val
        ans %= mod
    
    print(ans)

solve()