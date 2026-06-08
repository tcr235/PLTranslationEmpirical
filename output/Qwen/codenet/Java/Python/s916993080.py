import sys

input = sys.stdin.read
data = input().split()

sc = iter(data)

n = int(next(sc))
arr = [list(map(int, next(sc).split())) for _ in range(n)]

dp = [[0, 0, 0] for _ in range(n)]

dp[0][0] = arr[0][0]
dp[0][1] = arr[0][1]
dp[0][2] = arr[0][2]

for i in range(1, n):
    for j in range(3):
        if j == 0:
            dp[i][j] = max(arr[i][0] + dp[i-1][1], arr[i][0] + dp[i-1][2])
        elif j == 1:
            dp[i][j] = max(arr[i][1] + dp[i-1][0], arr[i][1] + dp[i-1][2])
        else:
            dp[i][j] = max(arr[i][2] + dp[i-1][1], arr[i][2] + dp[i-1][0])

max_value = max(dp[n-1])
print(max_value)