```python
import sys

class FastScanner:
    def __init__(self):
        self.in_ = sys.stdin
        self.buffer = bytearray(1024)
        self.ptr = 0
        self.buflen = 0

    def hasNextByte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            try:
                self.buflen = self.in_.readinto(self.buffer)
            except Exception as e:
                print(f"Error: {e}")
            if self.buflen <= 0:
                return False
        return True

    def readByte(self):
        if self.hasNextByte():
            return self.buffer[self.ptr]
        else:
            return -1

    def isPrintableChar(self, c):
        return 33 <= c <= 126

    def hasNext(self):
        while self.hasNextByte() and not self.isPrintableChar(self.buffer[self.ptr]):
            self.ptr += 1
        return self.hasNextByte()

    def next(self):
        if not self.hasNext():
            raise NoSuchElementException
        sb = []
        c = self.readByte()
        while self.isPrintableChar(c):
            sb.append(chr(c))
            c = self.readByte()
        return ''.join(sb)

    def nextLong(self):
        if not self.hasNext():
            raise NoSuchElementException
        n = 0
        minus = False
        c = self.readByte()
        if c == ord('-'):
            minus = True
            c = self.readByte()
        if c < ord('0') or ord('9') < c:
            raise ValueError
        while True:
            if ord('0') <= c <= ord('9'):
                n *= 10
                n += c - ord('0')
            elif c == -1 or not self.isPrintableChar(c):
                return -n if minus else n
            elif not self.hasNext():
                raise ValueError
            else:
                raise ValueError
            c = self.readByte()

    def nextInt(self):
        nl = self.nextLong()
        if nl < -2**31 or nl > 2**31-1:
            raise ValueError
        return int(nl)

    def nextDouble(self):
        return float(self.next())

class NoSuchElementException(Exception):
    pass

def main():
    fs = FastScanner()
    n = fs.nextInt()
    a = [fs.nextInt() for _ in range(n)]
    a.sort()