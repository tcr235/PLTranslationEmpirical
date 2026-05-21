import random
import string

class Main:
    def __init__(self):
        self.W = None
        self.H = None
        self.map = None
        self.dp = None
        self.rand = random.Random()

    def run(self):
        while True:
            try:
                self.W, self.H = map(int, input().split())
                if self.W == 0 and self.H == 0:
                    break
                self.map = [list(input()) for _ in range(self.H)]
                self.dp = [[BigInteger(0) for _ in range(self.W)] for _ in range(self.H)]

                for h in range(self.H):
                    for w in range(self.W):
                        h_prev = BigInteger(0)
                        if h >= 1:
                            h_prev = self.dp[h-1][w]
                        w_prev = BigInteger(0)
                        if w >= 1:
                            w_prev = self.dp[h][w-1]

                        if self.map[h][w] in string.digits:
                            max_val = max(h_prev, w_prev)
                            self.dp[h][w] = max_val * BigInteger(10) + BigInteger(self.map[h][w])
                        else:
                            self.dp[h][w] = BigInteger(0)

                max_val = BigInteger(0)
                for h in range(self.H):
                    for w in range(self.W):
                        max_val = max(max_val, self.dp[h][w])

                print(max_val)

            except (ValueError, IndexError):
                break

import decimal
from fractions import Fraction
from sympy import Rational
from sympy import Integer
class BigInteger(decimal.Decimal):
    def __new__(cls, value):
        return super(BigInteger, cls).__new__(cls, value)

if __name__ == "__main__":
    Main().run()