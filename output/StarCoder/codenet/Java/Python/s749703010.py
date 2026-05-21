class Pair:
    def __init__(self, l, r):
        self.l = l
        self.r = r

class Solution:
    def minFlips(self, arr1, arr2):
        n = len(arr1)
        memo = [[[float('inf')] * (1<<n) for _ in range(n+1)] for _ in range(2)]
        for z in memo:
            for x in z:
                x.fill(-1)

        def dp(fliped, idx, msk):
            if msk == (1<<n) - 1:
                return 0
            if memo[fliped][idx][msk] != -1:
                return memo[fliped][idx][msk]
            x = msk.bit_count()
            ff = 0
            ans = float('inf')
            for i in range(n):
                if not (msk & (1<<i)):
                    nf = x % 2
                    if idx == n or arr1[i] <= arr2[(nf + (ff % 2)) % 2]:
                        ans = min(ans, ff + dp((nf + (ff % 2)) % 2, i, msk | (1 << i)))
                    ff += 1
                else:
                    x -= 1
            memo[fliped][idx][msk] = ans
            return ans

        arr1 = [Pair(a, 0) for a in arr1]
        arr2 = [Pair(a, 1) for a in arr2]
        arr1.sort(key=lambda p: p.l)
        arr2.sort(key=lambda p: p.l)

        return -1 if dp(0, n, 0) >= 1e8 else dp(0, n, 0)

# Usage example:
arr1 = [3, 2, 4]
arr2 = [2, 4, 5]
solution = Solution()
print(solution.minFlips(arr1, arr2))