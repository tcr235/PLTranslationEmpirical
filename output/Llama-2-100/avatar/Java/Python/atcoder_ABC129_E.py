def atcoder_ABC129_E(M): def dp(i, prev): if i == 0: return [1, 0] if s[i] == '0': return dp(i-1, [prev[0], prev[1] * 2 % M]) if s[i] == '1': return dp(i-1, [prev[0] * 2 % M, prev[1] * 2 % M]) return [0, 0] def solve(): return (dp(n, [0, 0])[0] + dp(n, [0, 0])[1]) % M return solve()

