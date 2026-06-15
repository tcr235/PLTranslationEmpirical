def rec(v, parent):
    res = 1
    for next in to[v]:
        if next == parent: continue
        res += rec(next, v)
    return dp[v] = res

def modpow(x, y):
    if y == 0: return 1
    if y % 2 != 0: return x * modpow(x, y - 1) % mod
    return modpow(x, y // 2) * modpow(x, y // 2) % mod

def main():
    N = int(input())
    to = [[] for _ in range(N)]
    edges = [[-1, -1] for _ in range(N - 1)]
    for i in range(N - 1):
        A, B = map(int, input().split())
        to[A].append(B)
        to[B].append(A)
        edges[i] = (B, A)
    
    dp = [0] * N
    rec(0, -1)
    mulsum = 0
    for i in range(N - 1):
        child = edges[i][0]
        a = dp[child]
        b = N - a
        mul = (2 ** a) * (2 ** b) % mod
        mulsum += mul
        mulsum %= mod
    
    cases = (2 ** N) % mod
    PN = (mulsum + (cases - 1 + mod) % mod) % mod
    BN = N * (2 ** N - 1) % mod
    WN = (PN - BN + mod) % mod
    ans = WN * (cases ** (mod - 2)) % mod
    print(ans)

if __name__ == '__main__':
    main()
