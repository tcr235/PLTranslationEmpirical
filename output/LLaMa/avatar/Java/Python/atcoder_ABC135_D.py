import sys

MOD = int(1e9 + 7)

class atcoder_ABC135_D:
    def __init__(self):
        self.MOD = MOD

    def run(self):
        cs = list(input())
        dp = [[0 for _ in range(13)] for _ in range(len(cs))]
        base = 1
        for i in range(len(cs)):
            if cs[-1 - i] == '?':
                for pre in range(13):
                    for next in range(10):
                        if i > 0:
                            dp[i][((base * next + pre) % 13)] += dp[i - 1][pre]
                        else:
                            if pre == 0:
                                dp[i][((base * next + pre) % 13)] += 1
                        dp[i][(base * next + pre) % 13] %= self.MOD
            else:
                next = ord(cs[-1 - i]) - ord('0')
                for pre in range(13):
                    if i > 0:
                        dp[i][((base * next + pre) % 13)] += dp[i - 1][pre]
                    else:
                        if pre == 0:
                            dp[i][((base * next + pre) % 13)] += 1
                    dp[i][(base * next + pre) % 13] %= self.MOD
            base = (base * 10) % 13
        print(dp[-1][5])

if __name__ == "__main__":
    atcoder_ABC135_D().run()