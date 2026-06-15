import sys

class FastScanner:
    def __init__(self):
        self.in = sys.stdin
        self.buffer = bytearray(1024)
        self.ptr = 0
        self.buflen = 0

    def has_next_byte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            self.buflen = self.in.read(self.buffer)
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
            raise ValueError
        sb = bytearray()
        b = self.read_byte()
        while self.is_printable_char(b):
            sb.append(b)
            b = self.read_byte()
        return bytes(sb).decode()

    def next_long(self):
        if not self.has_next():
            raise ValueError
        long_ = 0
        minus = False
        b = self.read_byte()
        if b == -1:
            minus = True
            b = self.read_byte()
        if 33 <= b and b <= 126:
            while True:
                if 48 <= b and b <= 57:
                    long_ *= 10
                    long_ += b - 48
                elif b == -1:
                    return minus * long_
                else:
                    raise ValueError
                b = self.read_byte()
        else:
            raise ValueError

    def next_int(self):
        long_ = self.next_long()
        if long_ < Integer.MIN_VALUE or long_ > Integer.MAX_VALUE:
            raise ValueError
        return int(long_)

    def next_double(self):
        return float(self.next())

if __name__ == "__main__":
    main()



