def atcoder_AGC028_B(n):
    br = input()
    sa = br.split()
    a = [int(x) for x in sa]
    mod = 1000000007
    p = 1
    q = [1] * n
    for i in range(2, n):
        p = p * (i + 1) % mod
    for i in range(1, n - 1):
        q[i] = (q[i - 1] + modinv(i + 1, mod)) % mod
    ans = 0
    for i in range(n):
        val = q[i] + q[n - i - 1] - 1
        val *= a[i]
        val %= mod
        val *= p
        val %= mod
        ans += val
    print(ans)

def modinv(a, m):
    b = m
    u = 1
    v = 0
    while b > 0:
        t = a // b
        a -= t * b
        tmp = a
        a = b
        b = tmp
        u -= t * v
        tmp = u
        u = v
        v = tmp
    u %= m
    if u < 0:
        u += m
    return u

