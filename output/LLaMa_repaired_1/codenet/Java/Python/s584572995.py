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

    def next_line(self):
        return input()

class Main:
    def __init__(self):
        global N
        self.fs = FastScanner(sys.stdin)
        self.N = self.fs.next_int()
        self.to = [[] for _ in range(N + 1)]
        self.dp = [0] * (N + 1)
        for i in range(self.N - 1):
            a, b = map(lambda x: self.fs.next_int() - 1, input().split())
            self.to[a].append(b)
            self.to[b].append(a)
            edges.append([b, a]) # modify edge direction

        for i in range(self.N - 1):
            a, b = edges[i]
            if len(self.to[a]) > len(self.to[b]):
                edges[i][0], edges[i][1] = edges[i][1], edges[i][0]

    def rec(self, v, parent):
        res = 1
        for next in self.to[v]:
            if next == parent:
                continue
            res += self.rec(next, v)
        return res

    def modpow(self, x, y):
        if y == 0:
            return 1
        if y % 2 != 0:
            return (x * self.modpow(x, y - 1)) % mod
        tmp = self.modpow(x, y // 2)
        return (tmp * tmp) % mod

    def run(self):
        self.dp[0] = self.rec(0, -1)
        for i in range(self.N - 1):
            a, b = edges[i]
            candidate1, candidate2 = self.dp[a], self.dp[b]
            if candidate1 > candidate2:
                a, b = b, a
            child = a
            a = self.dp[child]
            b = self.N - a
            mul = ((self.modpow(2, a) -