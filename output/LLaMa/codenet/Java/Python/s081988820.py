```python
import math
import sys

class Main:
    def __init__(self):
        self.sc = Scanner(sys.stdin)

    def solve(self):
        H, W = self.sc.nextInt(), self.sc.nextInt()
        c = [[self.sc.nextInt() for _ in range(10)] for _ in range(10)]
        minv = [float('inf')] * 10
        for _ in range(10):
            for i in range(10):
                minv[i] = min(minv[i], c[i][1])
                for j in range(10):
                    minv[i] = min(minv[i], c[i][j] + minv[j])
        ans = 0
        for h in range(1, H+1):
            for w in range(1, W+1):
                A = self.sc.nextInt()
                if A >= 0:
                    ans += minv[A]
        print(ans)

class Scanner:
    def __init__(self, in_stream):
        self.in_stream = in_stream
        self.index = 0
        self.length = 0

    def is_printable_char(self, c):
        return ord('!') <= c <= ord('~')

    def is_digit(self, c):
        return ord('0') <= c <= ord('9')

    def has_next_byte(self):
        if self.index < self.length:
            return True
        else:
            try:
                self.length = self.in_stream.read(self.buffer)
                self.index = 0
            except Exception as e:
                print(e)
            return self.length > 0

    def has_next(self):
        while self.has_next_byte() and not self.is_printable_char(self.buffer[self.index]):
            self.index += 1
        return self.has_next_byte()

    def read_byte(self):
        return self.has_next_byte() and self.buffer[self.index]

    def next(self):
        if not self.has_next():
            raise RuntimeException("no input")
        sb = StringBuilder()
        b = self.read_byte()
        while self.is_printable_char(b):
            sb.append(chr(b))
            b = self.read_byte()
        return sb.toString()

    def next_int(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

class RuntimeException(Exception):
    pass

class FactorialTableCombCalculator:
    def __init__(self, size, mod):
        self.size = size
        self.factorial_table =