class Solution:
    def maxProfit(self, arr):
        n = len(arr)
        dp = [[0]*3 for _ in range(n)]
        dp[0][0] = arr[0][0]
        dp[0][1] = arr[0][1]
        dp[0][2] = arr[0][2]

        for i in range(1, n):
            for in_ in range(3):
                if in_ == 1:
                    j, k = 0, 2
                elif in_ == 0:
                    j, k = 1, 2
                else:
                    j, k = 0, 1
                dp[i][in_] = max(dp[i-1][k], dp[i-1][j]) + arr[i][in_]

        return max(dp[n-1])

# Example usage:
sol = Solution()
array = [
    [10, 4, 7],
    # Add more rows of data here if needed...
    [3, 5, 8]
]
print(sol.maxProfit(array))