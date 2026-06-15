def main():
    n = int(input())
    arr = [[int(input()) for _ in range(3)] for _ in range(n)]
    dp = [[int(arr[i][0]) + int(arr[i-1][1]) for _ in range(3)] for _ in range(n)]
    for i in range(1, n):
        for j in range(3):
            dp[i][j] = max(dp[i-1][j], dp[i-1][j-1] + arr[i][j], dp[i-1][j-2] + arr[i][j-1])
    max = -1
    for i in range(3):
        if dp[n-1][i] > max:
            max = dp[n-1][i]
    print(max)

if __name__ == '__main__':
    main()
