import sys

class FastScanner:
    def __init__(self, in=sys.stdin):
        self.in = in
        self.buffer = b''
        self.ptr = 0
        self.buflen = 0

    def has_next_byte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            self.buflen = self.in.read(self.buffer).decode('utf-8')
            if self.buflen <= 0:
                return False
            return True

    def read_byte(self):
        if self.has_next_byte():
            return self.buffer[self.ptr++]
        else:
            return -1

    def is_printable_char(self, c):
        return 33 <= c and c <= 126

    def has_next(self):
        while self.has_next_byte() and not self.is_printable_char(self.buffer[self.ptr]):
            self.ptr++
        return self.has_next_byte()

    def next(self):
        if not self.has_next():
            raise NoSuchElementException
        s = ''
        b = self.read_byte()
        while self.is_printable_char(b):
            s += chr(b)
            b = self.read_byte()
        return s

    def next_long(self):
        if not self.has_next():
            raise NoSuchElementException
        long_ = 0
        sign = False
        b = self.read_byte()
        if b == '-':
            sign = True
            b = self.read_byte()
        if 48 <= b and b <= 57:
            long_ = long_ * 10 + (b - 48)
        else:
            raise NumberFormatException
        while self.is_printable_char(b):
            if 48 <= b and b <= 57:
                long_ = long_ * 10 + (b - 48)
            else:
                raise NumberFormatException
            b = self.read_byte()
        return sign * long_

    def next_int(self):
        return int(self.next_long())

    def next_double(self):
        return float(self.next())

    def next_int_array(self, n):
        a = [None] * n
        for i in range(n):
            a[i] = self.next_int()
        return a

    def next_long_array(self, n):
        a = [None] * n
        for i in range(n):
            a[i] = self.next_long()
        return a

def main():
    scanner = FastScanner(sys.stdin)
    n, m, q = scanner.next_int_array(3)
    a, b, c, d = scanner.next_int_array(q)
    max = 0
    for i in range(q):
        if a[i] == b[i]:
            if c[i] == d[i]:
                max = max + d[i]
    print(max)

if __name__ == '__main__':
    main()
