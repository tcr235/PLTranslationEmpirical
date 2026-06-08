class Solution:
    def minFlips(self, arr1, arr2):
        n = len(arr1)
        memo = [[[-1] * (1<<n) for _ in range(n+1)] for _ in range(2)]

        def dp(fliped, idx, msk):
            if msk == (1<<n) - 1:
                return 0
            if memo[fliped][idx][msk] != -1:
                return memo[flipped][idx][msk]
            x = msk.bit_count()
            ff = 0
            ans = float('inf')
            for i in range(n):
                if not (msk & (1<<i)):
                    nf = x % 2
                    if idx == n or arr1[i] <= arr2[(nf + (ff % 2)) % 2][0]:
                        ans = min(ans, ff + dp((nf + (ff % 2)) % 2, i, msk | (1 << i)))
                    ff += 1
                else:
                    x -= 1
            memo[fliped][idx][msk] = ans
            return ans

        arr2 = [sorted([(num, 1) for num in arr2])]
        return -1 if dp(0, n, 0) >= 1e8 else dp(0, n, 0)

# Example usage:
arr1 = [3, 2, 4]
arr2 = [2, 4, 5]
solution = Solution()
print(solution.minFlips(arr1, arr2))