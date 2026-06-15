import sys

class MyWriter(object):
    def __init__(self, out):
        self.out = out
    def joinAndPrintln(self, x, delimiter=" "):
        b = ""
        if len(x) > 0:
            b += str(x[0])
            for i in range(1, len(x)):
                b += delimiter + str(x[i])
        self.println(b)
    def println(self, s):
        self.out.write(s + "\n")
    def flush(self):
        self.out.flush()

class MyScanner(object):
    def __init__(self, in_):
        self.in_ = in_
        self.buffer = ""
        self.point = 0
    def readByte(self):
        if self.point < len(self.buffer):
            result = self.buffer[self.point]
            self.point += 1
            return result
        self.buffer = self.in_.readline().rstrip()
        self.point = 0
        if self.buffer == "":
            return -1
        return self.buffer[self.point]
    def isPrintableCharExceptSpace(self, c):
        return 33 <= c and c <= 126
    def next(self):
        c = self.readByte()
        while not (c == -1 or self.isPrintableCharExceptSpace(c)):
            c = self.readByte()
        if c == -1:
            raise NoSuchElementException()
        b = ""
        while c!= -1 and self.isPrintableCharExceptSpace(c):
            b += chr(c)
            c = self.readByte()
        return b
    def nextLong(self):
        c = self.readByte()
        while not (c == -1 or self.isPrintableCharExceptSpace(c)):
            c = self.readByte()
        if c == -1:
            raise NoSuchElementException()
        minus = False
        if c == '-':
            minus = True
            c = self.readByte()
        result = 0L
        while c!= -1 and self.isPrintableCharExceptSpace(c):
            if c < '0' or c > '9':
                raise InputMismatchException()
            result = result * 10L + (c - '0')
            c = self.readByte()
        return minus? -result : result
    def nextInt(self):
        n = self.nextLong()
        if n < Integer.MIN_VALUE or n > Integer.MAX_VALUE:
            raise InputMismatchException()
        return (int)n
    def nextDouble(self):
        return Double.parseDouble(self.next())
    def nextIntArray(self, n):
        result = [0] * n
        for i in range(n):
            result[i] = self.nextInt()
        return result
    def nextVerticalIntArrays(self, a, b, *c):
        if not allSameLength(a, b, *c):
            raise IllegalArgumentException()
        for i in range(len(a)):
            a[i] = self.nextInt()
            b[i] = self.nextInt()
            for d in c:
                d[i] = self.nextInt()
    def nextLongArray(self, n):
        result = [0L] * n
        for i in range(n):
            result[i] = self.nextLong()
        return result
    def nextChar(self):
        c = self.readByte()
        while not (c == -1 or self.isPrintableCharExceptSpace(c)):
            c = self.readByte()
        if c == -1:
            raise NoSuchElementException()
        return chr(c)
    def nextCharArray(self, n):
        result = [0] * n
        for i in range(n):
            result[i] = self.nextChar()
        return result
    def next2dCharArray(self, n, m):
        result = [[0] * m] * n
        for i in range(n):
            for j in range(m):
                result[i][j] = self.nextChar()
        return result
    def nextVerticalCharArrays(self, a, b, *c):
        if not allSameLength(a, b, *c):
            raise IllegalArgumentException()
        for i in range(len(a)):
            a[i] = self.nextChar()
            b[i] = self.nextChar()
            for d in c:
                d[i] = self.nextChar()

class NoSuchElementException(Exception):
    pass

class InputMismatchException(Exception):
    pass

class IllegalArgumentException(Exception):
    pass

def allSameLength(a, b, *c):
    if
