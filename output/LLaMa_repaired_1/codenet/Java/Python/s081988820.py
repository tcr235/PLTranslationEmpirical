```python
class Main:
    def __init__(self):
        self.sc = Scanner(sys.stdin)
        self.bitset = BitSet(1000000)

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
        self.buffer = ''
        self.index = 0

    def is_printable_char(self, c):
        return ord('!') <= c <= ord('~')

    def is_digit(self, c):
        return ord('0') <= c <= ord('9')

    def has_next_byte(self):
        if self.index < len(self.buffer):
            return True
        else:
            try:
                byte_data = self.in_stream.read(1024)
                self.buffer += byte_data
                self.index = 0
            except Exception as e:
                print(e)
            return len(self.buffer) > self.index

    def has_next(self):
        while self.has_next_byte() and not self.is_printable_char(ord(self.buffer[self.index])):
            self.index += 1
        return self.has_next_byte()

    def read_byte(self):
        if self.has_next_byte():
            return self.buffer[self.index]
        else:
            return None

    def next(self):
        if not self.has_next():
            raise RuntimeException("no input")
        sb = ''
        b = self.read_byte()
        while self.is_printable_char(ord(b)):
            sb += b
            b = self.read_byte()
        return sb

    def next_int(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

class RuntimeException(Exception):
    pass

class BitSet:
    def __init__(self