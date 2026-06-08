```python
import sys

class InputReader:
    def __init__(self, in_file):
        self.in = open(in_file, 'r')
        self.buffer = ''
        self.curbuf = 0

    def add_buffer(self):
        new_chars = self.in.read(1)
        while new_chars:
            self.buffer += new_chars
            new_chars = self.in.read(1)

    def nextByte(self):
        if self.curbuf >= len(self.buffer):
            self.add_buffer()
            self.curbuf = 0
        if self.buffer[self.curbuf] == -1:
            return None
        b = self.buffer[self.curbuf]
        self.curbuf += 1
        return ord(b)

    def nextInt(self):
        byte = self.nextByte()
        while byte <= 32:
            byte = self.nextByte()
        ans = 0
        negative = False
        if byte == 45:
            negative = True
            byte = self.nextByte()
        while byte >= 48 and byte <= 57:
            ans = ans * 10 + (byte - 48)
            byte = self.nextByte()
        if not negative:
            return ans
        else:
            return -ans

    def nextLong(self):
        byte = self.nextByte()
        while byte <= 32:
            byte = self.nextByte()
        ans = 0
        negative = False
        if byte == 45:
            negative = True
            byte = self.nextByte()
        while byte >= 48 and byte <= 57:
            ans = ans * 10 + (byte - 48)
            byte = self.nextByte()
        if not negative:
            return ans
        else:
            return -ans

class S:
    E = (0, float('inf'), -float('inf'))

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
        c = ((10 ** (f[1]