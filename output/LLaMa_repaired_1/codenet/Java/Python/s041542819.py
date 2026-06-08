```python
import math
import bisect

class LightScanner:
    def __init__(self, in_stream):
        self.reader = in_stream
        self.tokenizer = None

    def string(self):
        if self.tokenizer == None or not self.tokenizer:
            try:
                self.tokenizer = self.reader.readline().split()
            except Exception as e:
                raise Exception(e)
        if self.tokenizer == None:
            return None
        try:
            return self.tokenizer.pop(0)
        except IndexError:
            self.tokenizer = None
            return None

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
        if v:
            return min(v)
        else:
            raise Exception("Array is empty")

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
    t = [-10**9] + [sc.l