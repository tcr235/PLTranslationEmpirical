```python
import sys
import math

class S:
    E = (0, math.inf, -math.inf)

    def __init__(self, sum, l, r):
        self.sum = sum
        self.l = l
        self.r = r

    @staticmethod
    def op(s1, s2):
        sum = (s1[0] + s2[0]) % 998244353
        if sum >= 998244353:
            sum -= 998244353
        return (sum, min(s1[1], s2[1]), max(s1[2], s2[2]))

    @staticmethod
    def map(f, s):
        c = (10 ** (f[1] - s[2]) - 10 ** (f[1] - s[1] - 1)) % 998244353
        if c < 0:
            c += 998244353
        return ((c * f[0] * pow(9, -1, 998244353)) % 998244353,
                s[1], s[2])

class F:
    I = (0, 0)

    def __init__(self, D, N):
        self.D = D
        self.N = N

    @staticmethod
    def composite(f, g):
        return F(f[0], f[1])

    def __repr__(self):
        return f"F({self.D}, {self.N})"

class LazySegTree:
    def __init__(self, dat, op, e, mapping, composition, id):
        self.MAX = len(dat)
        self.N = 1
        self.Log = 0
        while self.N < self.MAX:
            self.N <<= 1
            self.Log += 1
        self.Op = op
        self.E = e
        self.Mapping = mapping
        self.Composition = composition
        self.Id = id
        self.Dat = [e] * (self.N << 1)
        self.Laz = [id] * self.N
        for i in range(self.MAX):
            self.Dat[self.N + i] = dat[i]
        for i in range(self.N - 1, 0, -1):
            self.Dat[i] = op(self.Dat[i << 1], self.Dat[i << 1 | 1])
        self.updateFrom(1,