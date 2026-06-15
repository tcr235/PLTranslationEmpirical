import sys

class Solver:
    def solve(self, testNumber, in, out):
        K = in.nextInt()
        S = in.nextInt()
        ans = 0
        for x in range(K+1):
            for y in range(K+1):
                wk = S - x - y
                if wk >= 0 and wk <= K:
                    ans += 1
        out.println(ans)

class MyInput:
    def __init__(self, stream):
        self.stream = stream
        self.buffer = ""
        self.pos = 0
        self.lineNumber = 0
        self.eof = False

    def read(self):
        if self.eof:
            return -1
        if self.pos >= len(self.buffer):
            self.buffer = self.stream.readline()
            self.pos = 0
            self.lineNumber += 1
            if self.buffer == "":
                self.eof = True
                return -1
        c = self.buffer[self.pos]
        self.pos += 1
        return ord(c)

    def nextInt(self):
        ret = 0
        sign = 1
        c = self.read()
        while c <= ord(' ') and c!= -1:
            c = self.read()
        if c == ord('-'):
            sign = -1
            c = self.read()
        while c > ord(' ') and c!= -1:
            ret = ret * 10 + c - ord('0')
            c = self.read()
        return sign * ret

    def nextLong(self):
        ret = 0
        sign = 1
        c = self.read()
        while c <= ord(' ') and c!= -1:
            c = self.read()
        if c == ord('-'):
            sign = -1
            c = self.read()
        while c > ord(' ') and c!= -1:
            ret = ret * 10 + c - ord('0')
            c = self.read()
        return sign * ret

    def nextString(self):
        ret = ""
        c = self.read()
        while c <= ord(' ') and c!= -1:
            c = self.read()
        while c > ord(' ') and c!= -1:
            ret += chr(c)
            c = self.read()
        return ret

    def nextChar(self):
        c = self.read()
        while c <= ord(' ') and c!= -1:
            c = self.read()
        return c

    def nextDouble(self):
        ret = 0
        sign = 1
        c = self.read()
        while c <= ord(' ') and c!= -1:
            c = self.read()
        if c == ord('-'):
            sign = -1
            c = self.read()
        while c > ord(' ') and c!= -1:
            ret = ret * 10 + c - ord('0')
            c = self.read()
        return sign * ret

if __name__ == '__main__':
    solver = Solver()
    in_ = MyInput(sys.stdin)
    out_ = MyInput(sys.stdout)
    solver.solve(1, in_, out_)

