import sys

class MyInput:
    def __init__(self, input_stream):
        self.in = input_stream
        self.pos = 0
        self.read_len = 0
        self.buffer = [0] * 1024 * 8
        self.str = [0] * 500 * 8 * 2
        self.is_digit = [True] * 256
        self.is_space = [True] * 256
        self.is_line_sep = [True] * 256

    def read(self):
        if self.pos >= self.read_len:
            self.pos = 0
            try:
                self.read_len = self.in.read(self.buffer)
            except IOError:
                raise RuntimeError()
            if self.read_len <= 0:
                raise EndOfFileRuntimeException()
        return self.buffer[self.pos++]

    def nextInt(self):
        len = 0
        self.str[len++] = self.nextChar()
        len = self.reads(len, self.is_space)
        i = 0
        ret = 0
        if self.str[0] == '-':
            i = 1
        for i in range(len):
            ret = ret * 10 + self.str[i] - '0'
        if self.str[0] == '-':
            ret = -ret
        return ret

    def nextLong(self):
        len = 0
        self.str[len++] = self.nextChar()
        len = self.reads(len, self.is_space)
        i = 0
        ret = 0L
        if self.str[0] == '-':
            i = 1
        for i in range(len):
            ret = ret * 10 + self.str[i] - '0'
        if self.str[0] == '-':
            ret = -ret
        return ret

    def nextString(self):
        ret = ''
        for i in range(len(self.str)):
            ret += self.str[i]
        return ret.strip()

    def nextDChar(self):
        len = 0
        len = self.reads(len, self.is_space)
        ret = [0] * len + [0x00]
        for i in range(len):
            ret[i] = self.str[i]
        return ''.join(ret)

    def nextChar(self):
        while True:
            try:
                c = self.read()
                if c not in self.is_space:
                    return c
            except EndOfFileRuntimeException:
                pass

    def reads(self, len, accept):
        try:
            while True:
                c = self.read()
                if c in accept:
                    break
                if len == 0:
                    raise EndOfFileRuntimeException()
                self.str[len++] = c
        except EndOfFileRuntimeException:
            pass
        return len

    class EndOfFileRuntimeException(RuntimeError):
        pass

def main():
    in = MyInput(sys.stdin.read())
    ans = 0
    K = in.nextInt()
    S = in.nextInt()
    for x in range(K):
        for y in range(K):
            if S - x - y >= 0 and S - x - y <= K:
                ans += 1
    print(ans)

if __name__ == '__main__':
    main()

