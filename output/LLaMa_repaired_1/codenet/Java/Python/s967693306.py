```python
import sys
import math
from typing import List
from collections import defaultdict

class Main:
    def __init__(self):
        self.INF = math.inf
        self.MOD = 1_000_000_007
        self.SIZE = 1_000_000
        self.fact = [1] * (self.SIZE + 1)
        self.inv = [1] * (self.SIZE + 1)
        self.finvs = [1] * (self.SIZE + 1)

    def gcd(self, a, b):
        if b == 0:
          return a
        return self.gcd(b, a % b)

    def lcm(self, a, b):
        return a * b // self.gcd(a, b)

    def inv(self, a):
        return pow(a, self.MOD - 2, self.MOD)

    def pow(self, a, r):
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

    def modComb(self, n, r):
        if n < r or n < 0 or r < 0:
            return 0
        return self.fact[n] * self.finvs[r] % self.MOD * self.finvs[n - r] % self.MOD

    def comb(self, n, r):
        num = 1
        for i in range(1, r + 1):
            num = num * (n - i + 1) // i
        return num

    def isPrime(self, a):
        if a <= 1:
            return False
        for i in range(2, int(a ** 0.5) + 1):
            if a % i == 0:
                return False
        return True

    def nextPermutation(self, s):
        list = list(s)
        pivotPos = -1
        pivot = '0'
        for i