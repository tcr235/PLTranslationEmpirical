import sys

class MyInput:
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

    def skip_unprintable(self):
        while self.has_next_byte() and not isprintable(self.buffer[self.ptr]):
            self.ptr++

    def has_next(self):
        self.skip_unprintable()
        return self.has_next_byte()

    def next(self):
        if not self.has_next():
            raise ValueError("No such element")
        builder = bytearray()
        b = self.read_byte()
        while isprintable(b):
            builder.append(b)
            b = self.read_byte()
        return builder.decode()

    def next_long(self):
        if not self.has_next():
            raise ValueError("No such element")
        long_ = 0
        minus = False
        b = self.read_byte()
        if b == -1:
            minus = True
            b = self.read_byte()
        if not isprintable(b):
            raise ValueError("Not a number")
        while True:
            if isdigit(b):
                long_ *= 10
                long_ += int(b) - 48
            else:
                break
            b = self.read_byte()
        return minus * long_

    def next_int(self):
        long_ = self.next_long()
        if long_ < Integer.MIN_VALUE or long_ > Integer.MAX_VALUE:
            raise ValueError("Not an integer")
        return int(long_)

    def next_double(self):
        return float(self.next())

def isprintable(b):
    return 33 <= b and b <= 126

def isdigit(b):
    return 48 <= b and b <= 57

def main():
    in = MyInput()
    Sd = in.next()
    T = in.next()
    count = 0
    c
    ok = False
    first = -1
    end = -1
    for j in range(len(Sd)):
        count = 0
        for i in range(len(Sd)):
            c = Sd[i]
            if c == '?' or c == T[count]:
                count += 1
                if count == len(T):
                    first = i
                    end = i
                    ok = True
                    break
        if ok:
            break
    if ok:
        for i in range(len(Sd)):
            if first <= i and i <= end:
                print(T[i - first], end = '', sep = '')
            else:
                if Sd[i] == '?':
                    print('a', end = '', sep = '')
                else:
                    print(Sd[i], end = '', sep = '')
        print()
    else:
        print("UNRESTORABLE")

if __name__ == "__main__":
    main()
