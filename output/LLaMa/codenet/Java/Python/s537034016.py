mod = 1000000007

def dfs(s, dp):
    if dp.get(s, -1) != -1:
        return dp[s]
    
    ret = 0
    for i in range(s - 3, -1, -1):
        ret = (ret + dfs(i, dp)) % mod
    dp[s] = ret
    return ret

def main():
    s = int(input())
    dp = {i: -1 for i in range(s + 1)}
    dp[0] = 1
    print(dfs(s, dp))

if __name__ == "__main__":
    main()