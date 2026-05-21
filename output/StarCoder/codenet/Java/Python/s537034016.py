def dfs(s, dp, mod):
    if dp[s] != -1:
        return dp[s]
    
    ret = 0
    for i in range(s - 3, 0, -1):
        ret += dfs(i, dp, mod)
        ret %= mod
    return dp[s] = ret

s = int(input())
mod = 1000000007
dp = [-1] * (s + 1)
dp[0] = 1

print(dfs(s, dp, mod))