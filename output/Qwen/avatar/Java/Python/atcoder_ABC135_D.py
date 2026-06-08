class atcoder_ABC135_D:
    def __init__(self):
        self.MOD = 10**9 + 7

    def run(self):
       (cs := list(input()))[::-1]
        dp = [[0]*13 for _ in range(len(cs))]
        base = 1
        for i in range(len(cs)):
            if cs[i] == '?':
                for pre in range(13):
                    for next_num in range(10):
                        dp[i][(base*next_num + pre) % 13] += (dp[i-1][pre] if i > 0 else (1 if pre == 0 else 0))
                        dp[i][(base*next_num + pre) % 13] %= self.MOD
            else:
                next_num = int(cs[i])
                for pre in range(13):
                    dp[i][(base*next_num + pre) % 13] += (dp[i-1][pre] if i > 0 else (1 if pre == 0 else 0))
                    dp[i][(base*next_num + pre) % 13] %= self.MOD
            base = base * 10 % 13
        print(dp[len(cs)-1][5])

atcoder_ABC135_D().run()