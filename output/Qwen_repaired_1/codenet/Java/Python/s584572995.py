```python
MOD = 10**9 + 7

mod_pow_cache = {}

def mod_power(x, y):
    if (x, y) not in mod_pow_cache:
        if y == 0:
            mod_pow_cache[(x, y)] = 1
        elif y % 2 != 0:
            mod_pow_cache[(x, y)] = x * mod_power(x, y - 1) % MOD
        else:
            tmp = mod_power(x, y // 2)
            mod_pow_cache[(x, y)] = (tmp * tmp) % MOD
    return mod_pow_cache[(x, y)]

def find_child(v, parent, dp):
    return dp[v] if dp[v] > dp[parent] else v

def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    index = 0
    def get_next_int():
        nonlocal index
        result = int(data[index])
        index += 1
        return result
    
    N = get_next_int()
    to = [[] for _ in range(N)]
    edges = []
    for _ in range(N - 1):
        A = get_next_int() - 1
        B = get_next_int() - 1
        to[A].append(B)
        to[B].append(A)
        edges.append([B, A])
    
    dp = [0] * N
    
    def rec(v, parent):
        res = 1
        for next_ in to[v]:
            if next_ == parent:
                continue
            res += rec(next_, v)
        dp[v] = res
        return dp[v]
    
    rec(0, -1)
    
    mul_sum = 0
    for u, v in edges:
        child = find_child(u, v, dp)
        a = dp[child]
        b = N - a
        mul = (mod_power(2, a) - 1) * (mod_power(2, b) - 1) % MOD
        mul_sum += mul
        mul_sum %= MOD
    
    cases = mod_power(2, N)
    PN = (mul_sum + (cases - 1 + MOD) % MOD) % MOD
    BN = N * mod_power(2, N - 1) % MOD
    WN = (PN - BN + MOD) % MOD
    ans = WN *