```python
import sys

class Solution:
    def __init__(self):
        self.scanner = self.init_scanner()

        while True:
            line = self.scanner.readline()
            if not line:
                break
            self.run_case(line)

        self.scanner.close()

    def init_scanner(self):
        import re
        import sys

        return sys.stdin

    def run_case(self, line):
        N, K = map(int, line.split())

        len_ = 0
        n = N
        while n > 0:
            n //= K
            len_ += 1

        print(len_)

class LCS:
    def lcs(self, A, B):
        sz_a = len(A)
        sz_b = len(B)
        dp = [[0] * (sz_b + 1) for _ in range(sz_a + 1)]

        for i in range(sz_a + 1):
            dp[i][0] = 0
        for j in range(sz_b + 1):
            dp[0][j] = 0

        for i in range(1, sz_a + 1):
            for j in range(1, sz_b + 1):
                if A[i - 1] == B[j - 1]:
                    dp[i][j] = dp[i - 1][j - 1] + 1
                else:
                    dp[i][j] = max(dp[i - 1][j], dp[i][j - 1])

        return dp[sz_a][sz_b]

    def get_lcs(self, X, Y):
        sz_a = len(X)
        sz_b = len(Y)
        m = X
        n = Y
        index = self.lcs(m, n)
        temp = index

        lcs = ['\0'] * (index + 1)
        lcs[index] = '\0'

        i = sz_a
        j = sz_b
        while i > 0 and j > 0:
            if X[i - 1] == Y[j - 1]:
                lcs[index - 1] = X[i - 1]
                i -= 1
                j -= 1
                index -= 1
            elif dp[i - 1][j] > dp[i][j - 1]:
                i -= 1
            else:
                j -= 1

        return ''.