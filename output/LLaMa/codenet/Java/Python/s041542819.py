```python
import math
import bisect

class LightScanner:
    def __init__(self, in_stream):
        self.reader = in_stream

    def string(self):
        return self.reader.readline().strip()

    def ints(self):
        return int(self.string())

    def longs(self):
        return int(self.string())

class LightWriter:
    def __init__(self, out_stream, autoflush=False):
        self.out_stream = out_stream
        self.autoflush = autoflush
        self.breaked = True

    def print(self, c):
        self.out_stream.write(c)
        self.breaked = False

    def print(self, s):
        self.out_stream.write(s)
        self.breaked = False

    def ans(self, s):
        if not self.breaked:
            self.print(' ')
        self.print(s)
        return self

    def ans(self, l):
        return self.ans(str(l))

    def ansln(self, *args):
        for arg in args:
            self.ans(arg).ln()
        return self

    def ln(self):
        self.print('\n')
        self.breaked = True
        if self.autoflush:
            self.out_stream.flush()
        return self

    def close(self):
        self.out_stream.close()

class IntMath:
    @staticmethod
    def min(v):
        return min(v)

class ArrayUtil:
    @staticmethod
    def lower_bound(a, t, min=0):
        max = len(a)
        while min < max:
            mid = (min + max) // 2
            if t <= a[mid]:
                max = mid
            else:
                min = mid + 1
        return min

def solve(sc, writer):
    a, b, q = sc.ints(), sc.ints(), sc.ints()
    s = [-10**9] + [sc.longs() for _ in range(a)] + [2*10**9]
    t = [-10**9] + [sc.longs() for _ in range(b)] + [2*10**9]
    for _ in range(q):
        x = sc.longs()
        sl = x - s[ArrayUtil.lower_bound(s, x + 1) - 1]
        tl = x - t[ArrayUtil.lower_bound(t, x + 1) - 1]
        sr = s[ArrayUtil.lower_bound(s, x)] - x