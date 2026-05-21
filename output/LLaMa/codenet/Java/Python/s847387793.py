```python
import sys
import math

class FastScanner:
    def __init__(self):
        self.in_stream = sys.stdin
        self.buffer = bytearray(1024)
        self.ptr = 0
        self.buflen = 0

    def hasNextByte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            try:
                self.buflen = self.in_stream.readinto(self.buffer)
            except IOError as e:
                print(e, file=sys.stderr)
            if self.buflen <= 0:
                return False
        return True

    def readByte(self):
        if self.hasNextByte():
            return self.buffer[self.ptr]
        else:
            return -1

    def isPrintableChar(self, c):
        return 33 <= c and c <= 126

    def hasNext(self):
        while self.hasNextByte() and not self.isPrintableChar(self.buffer[self.ptr]):
            self.ptr += 1
        return self.hasNextByte()

    def next(self):
        if not self.hasNext():
            raise NoSuchElementException
        s = bytearray()
        while True:
            c = self.readByte()
            if self.isPrintableChar(c):
                s.append(c)
            else:
                break
        return s.decode('utf-8')

    def nextLong(self):
        if not self.hasNext():
            raise NoSuchElementException
        n = 0
        minus = False
        b = self.readByte()
        if b == ord('-'):
            minus = True
            b = self.readByte()
        if not self.isPrintableChar(b) or b < ord('0') or ord('9') < b:
            raise ValueError
        while True:
            if self.isPrintableChar(b) and ord('0') <= b <= ord('9'):
                n = n * 10 + b - ord('0')
            elif b == -1 or not self.isPrintableChar(b):
                return n if not minus else -n
            else:
                raise ValueError
            b = self.readByte()

    def nextInt(self):
        n = self.nextLong()
        if n < -2**31 or n > 2**31 - 1:
            raise ValueError
        return int(n)

    def nextDouble(self):
        return float(self.next())

    def nextIntArray(self, n):
        a = [0]*n
        for i in range(n