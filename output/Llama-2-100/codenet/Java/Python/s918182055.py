import java
import java.io
import java.awt.Point

class Main:

    def __init__(self, *args):
        self.my_writer = MyWriter(sys.out)
        self.my_scanner = MyScanner(sys.in)
        self.N = self.my_scanner.nextInt()
        self.M = self.my_scanner.nextInt()
        self.list = [None] * 100001

        for i in range(self.N):
            a = self.my_scanner.nextInt()
            b = self.my_scanner.nextInt()
            if self.list[a] is None:
                self.list[a] = []
            self.list[a].append(b)

        self.res = 0
        self.pqueue = PriorityQueue(reversed=True)
        for i in range(1, self.M):
            if self.list[i] is not None:
                self.pqueue.addall(self.list[i])
                self.res += self.pqueue.pop()

        self.my_writer.println(self.res)
        self.my_writer.flush()

    class MyScanner:
        def __init__(self, *args):
            self.in = sys.stdin.buffer
            self.buffer = [0] * 8192
            self.point = 0
            self.read_length = 0

        def readByte(self):
            if self.point < self.read_length:
                return self.buffer[self.point]
            else:
                try:
                    self.read_length = self.in.read(self.buffer)
                except Exception as e:
                    raise AssertionError(None, e)
                if self.read_length == -1:
                    return -1
                self.point = 0
                return self.buffer[0]

        def next(self):
            c = self.readByte()
            while not (c == -1 or c.isprintable()):
                c = self.readByte()
            return c

        def nextLong(self):
            c = self.readByte()
            while not (c == -1 or c.isprintable()):
                c = self.readByte()
            if c == -1:
                raise NoSuchElementException
            boolean minus = false
            if c == '-':
                minus = true
                c = self.readByte()
            long result = 0L
            do:
                if c.isdigit():
                    result = result * 10L + (c - '0')
                    c = self.readByte()
                else:
                    break
            while c.isprintable()
            if minus:
                result = -result
            return result

        def nextInt(self):
            return self.nextLong()

        def nextDouble(self):
            return float(self.next())

        def nextChar(self):
            return self.next()

        def nextCharArray(self, n):
            return [self.nextChar() for _ in range(n)]

        def nextIntArray(self, n):
            return [self.nextInt() for _ in range(n)]

        def nextLongArray(self, n):
            return [self.nextLong() for _ in range(n)]

        def nextVerticalIntArrays(self, a, b, *c):
            if not allSameLength(a, b, c):
                raise IllegalArgumentException
            for i in range(a.length):
                a[i] = self.nextInt()
                b[i] = self.nextInt()
                for d in c:
                    d[i] = self.nextInt()

        def nextVerticalCharArrays(self, a, b, *c):
            if not allSameLength(a, b, c):
                raise IllegalArgumentException
            for i in range(a.length):
                a[i] = self.nextChar()
                b[i] = self.nextChar()
                for d in c:
                    d[i] = self.nextChar()

class MyWriter:
    def __init__(self, *args):
        self.out = sys.out

    def joinAndPrintln(self, x):
        self.joinAndPrintln(x, " ")

    def joinAndPrintln(self, x, delimiter):
        b = "".join(x)
        self.println(b)

    def joinAndPrintln(self, iterable):
        b = "".join(iterable)
        self.println(b)

    def println(self, x):
        self.out.write(x.encode())
        self.out.flush()