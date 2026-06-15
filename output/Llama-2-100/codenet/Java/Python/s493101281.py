import sys

class FastScanner:
    def __init__(self):
        self.in = sys.stdin
        self.buffer = [0] * 1024
        self.ptr = 0
        self.buflen = 0

    def has_next(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            self.buflen = self.in.read(self.buffer)
            if self.buflen <= 0:
                return False
            return True

    def read_byte(self):
        if self.has_next():
            return self.buffer[self.ptr++]
        else:
            return -1

    def read_string(self):
        sb = []
        b = self.read_byte()
        while b != -1 and isprintable(b):
            sb.append(chr(b))
            b = self.read_byte()
        return ''.join(sb)

    def read_long(self):
        if not self.has_next():
            raise ValueError
        long_str = self.read_string()
        if long_str[0] == '-':
            return -long(long_str[1:])
        else:
            return long(long_str)

    def read_int(self):
        return int(self.read_long())

    def read_double(self):
        return float(self.read_string())

def isprintable(c):
    return 33 <= c and c <= 126

def main():
    scanner = FastScanner()
    n = scanner.read_int()
    l = [scanner.read_int() for _ in range(n)]
    l.sort()
    print(l[n//2] - l[n//2-1])

if __name__ == '__main__':
    main()
