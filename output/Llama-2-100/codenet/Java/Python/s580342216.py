//--- pB ---//
import java
import java.util
import java.lang
import java.io

class Solution:
    scanner = None

    def __init__(self):
        self.scanner = input

        # scanner.nextLine();
        while self.scanner.hasNext():
            self.run_case()

    def run_case(self):
        # scanner.nextLine();
        line = self.scanner.nextLine()
        N = int(line.split(" ")[0])
        K = int(line.split(" ")[1])

        len = 0
        while N > 0:
            N //= K
            len += 1

        print(len)
        return

    def strToIntArray(self, str):
        vals = str.split(" ")
        sz = len(vals)
        res = [int(x) for x in vals]
        return res

class LCS:
    dp = None

    def __init__(self):
        self.dp = [[0] * (len(str) + 1) for _ in range(len(str) + 1)]

    def lcs(self, A, B):
        sz_a = len(A)
        sz_b = len(B)
        for i in range(sz_a + 1):
            for j in range(sz_b + 1):
                if A[i - 1] == B[j - 1]:
                    self.dp[i][j] = self.dp[i - 1][j - 1] + 1
                else:
                    self.dp[i][j] = max(self.dp[i - 1][j], self.dp[i][j - 1])
        return self.dp[sz_a][sz_b]

    def getLCS(self, X, Y):
        m = len(X)
        n = len(Y)
        index = self.dp[m][n]
        temp = index

        lcs = [0] * (index + 1)
        lcs[index] = 0

        i = m
        j = n
        while i > 0 and j > 0:
            if X[i - 1] == Y[j - 1]:
                lcs[index - 1] = X[i - 1]
                i -= 1
                j -= 1
                index -= 1
            else:
                if self.dp[i - 1][j] > self.dp[i][j - 1]:
                    i -= 1
                else:
                    j -= 1

        return "".join(lcs).strip()

# Test case
if __name__ == "__main__":
    s = Solution()
    s.run_case()




