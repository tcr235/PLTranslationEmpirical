```python
import sys
import math

mod = 10**9 + 7
N, edges = 0, []

class FastScanner:
    def __init__(self, in_file):
        self.reader = sys.stdin
        self.tokenizer = []

    def next(self):
        if not self.tokenizer or not self.tokenizer[0]:
            self.tokenizer = input().split()
        return self.tokenizer.pop(0)

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_line(self):
        return input()

class Main:
    def __init__(self):
        fs = FastScanner(sys.stdin)
        self.N = fs.next_int()
        self.to = [[] for _ in range(N + 1)]
        self.dp = [0] * (N + 1)
        for i in range(self.N - 1):
            a, b = map(lambda x: fs.next_int() - 1, input().split())
            self.to[a].append(b)
            self.to[b].append(a)
            edges.append([a, b])

    def rec(self, v, parent):
        self.dp[v] = 1
        for next in self.to[v]:
            if next == parent:
                continue
            self.dp[v] += self.rec(next, v)
        return self.dp[v]

    def modpow(self, x, y):
        if y == 0:
            return 1
        if y % 2 != 0:
            return x * self.modpow(x, y - 1) % mod
        tmp = self.modpow(x, y // 2)
        return tmp * tmp % mod

    def run(self):
        self.rec(0, -1)
        mulsum = 0
        for e in edges:
            candidate1, candidate2 = e[0], e[1]
            child = candidate1
            if self.dp[candidate1] > self.dp[candidate2]:
                child = candidate2
            a = self.dp[child]
            b = self.N - a
            mul = (self.modpow(2, a) - 1) * (self.modpow(2, b) - 1) % mod
            mulsum += mul
            mulsum %= mod
        cases = self.modpow(2, self.N)
        PN = (mulsum + (cases - 1 +