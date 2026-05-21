```python
import sys
import math
from typing import List
from collections import defaultdict

class Main:
    def __init__(self):
        self.MOD = 1_000_000_007
        self.SIZE = 1_000_000
        self.fact = [1] * (self.SIZE + 1)
        self.inv = [1] * (self.SIZE + 1)
        self.finvs = [1] * (self.SIZE + 1)

    def solve(self):
        n, m = map(int, input().split())
        map = {}
        for _ in range(m):
            s, c = map(int, input().split())
            if s in map and map[s] != c:
                print(-1)
                sys.exit(0)
            map[s] = c

        for i in range(1000):
            s = str(i)
            flag = True
            if len(s) < n: continue
            for j in range(n):
                if (map.get(j + 1) is not None and map.get(j + 1) != int(s[j])) or (map.get(j + 1) is None and int(s[j]) != 0):
                    if map.get(j + 1) is None and j == 0 and int(s[j]) == 1:
                        continue
                    flag = False
                    break
            if flag and len(s) == n:
                print(s)
                sys.exit(0)

        print(-1)

    def mod_pow(self, a, r):
        sum = 1
        while r > 0:
            if (r & 1) == 1:
                sum = (sum * a) % self.MOD
            a = (a * a) % self.MOD
            r >>= 1
        return sum

    def modFact(self, n):
        if n == 0:
            return 1
        return (n * self.modFact(n - 1)) % self.MOD

    def fact(self, n):
        if n == 0:
            return 1
        return n * self.fact(n - 1)

    def initCOMB(self):
        self.fact[0] = self.fact[1] = 1
        self.inv[1] = 1
        self.finvs[0] = self.finvs[1] = 1
        for i in range(2