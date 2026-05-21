```python
MOD1 = 1000000007
MOD2 = 998244353
inv9 = pow(9, -1, MOD2)

class LazySegTree:
    def __init__(self, dat, op, e, mapping, composition, id):
        self.MAX = len(dat)
        k = 1
        while k < self.MAX: k <<= 1
        self.N = k
        self.Log = self.N.bit_length() - 1
        self.Op = op
        self.E = e
        self.Mapping = mapping
        self.Composition = composition
        self.Id = id
        self.Dat = [e] * (self.N * 2)
        self.Laz = [id] * (self.N * 2)
        self.build(dat)

    def build(self, dat):
        for i in range(len(dat)):
            self.Dat[self.N + i] = dat[i]
        for i in range(self.N - 1, 0, -1):
            self.Dat[i] = self.Op(self.Dat[i << 1 | 0], self.Dat[i << 1 | 1])

    def push(self, k):
        if (self.Laz[k] == self.Id): return
        lk, rk = k << 1 | 0, k << 1 | 1
        self.Dat[lk] = self.Mapping(self.Laz[k], self.Dat[lk])
        self.Dat[rk] = self.Mapping(self.Laz[k], self.Dat[rk])
        if lk < self.N:
            self.Laz[lk] = self.Composition(self.Laz[k], self.Laz[lk])
        if rk < self.N:
            self.Laz[rk] = self.Composition(self.Laz[k], self.Laz[rk])
        self.Laz[k] = self.Id

    def push_to(self, k):
        for i in range(self.Log, 0, -1):
            self.push(k >> i)

    def update_from(self, k):
        k >>= 1
        while k:
            self.Dat[k] = self.Op(self.Dat[k << 1 | 0], self.Dat[k << 1 | 1])
            k >>= 1

    def set(self, p, x):
        self.exclusive_range_check(p)
        p