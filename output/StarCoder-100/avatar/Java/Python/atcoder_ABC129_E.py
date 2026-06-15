import sys

def main():
    s = sys.stdin.readline().strip()
    n = len(s)
    dp = [[0, 0] for _ in range(n+1)]
    dp[0][0] = 1
    for i in range(n):
        if s[i] == '0':
            dp[i+1][0] = dp[i][0]
            dp[i+1][1] = dp[i][1]
        else:
            dp[i+1][1] = (dp[i][0] + dp[i][1]) % 1000000007
        if s[i] == '0':
            dp[i+1][1] += (dp[i][1] * 2) % 1000000007
            dp[i+1][1] %= 1000000007
        else:
            dp[i+1][0] += (dp[i][0] * 2) % 1000000007
            dp[i+1][1] += (dp[i][1] * 2) % 1000000007
            dp[i+1][0] %= 1000000007
            dp[i+1][1] %= 1000000007
    print((dp[n][0] + dp[n][1]) % 1000000007)

if __name__ == '__main__':
    main()

