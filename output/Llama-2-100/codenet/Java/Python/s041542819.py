import java.io
import java.util
import java.util.stream

class LightScanner:
    def __init__(self, input_stream):
        self.reader = input_stream
        self.tokenizer = None

    def string(self):
        if self.tokenizer is None or not self.tokenizer.has_more_tokens():
            try:
                self.tokenizer = java.lang.StringTokenizer(self.reader.readLine())
            except java.io.IOException:
                raise
        return self.tokenizer.nextToken()

    def ints(self):
        return int(self.string())

    def longs(self):
        return long(self.string())

class LightWriter:
    def __init__(self, output_stream):
        self.out = output_stream
        self.autoflush = False
        self.breaked = True

    def print(self, c):
        try:
            self.out.write(c)
            self.breaked = False
        except java.io.IOException:
            raise
        return self

    def print(self, s):
        try:
            self.out.write(s, 0, s.length())
            self.breaked = False
        except java.io.IOException:
            raise
        return self

    def ans(self, s):
        if not self.breaked:
            self.print(' ')
        return self.print(s)

    def ans(self, l):
        return self.ans(str(l))

    def ansln(self, *ns):
        for n in ns:
            self.ans(n)
            self.ln()
        return self

    def ln(self):
        self.print(java.lang.System.lineSeparator())
        self.breaked = True
        if self.autoflush:
            try:
                self.out.flush()
            except java.io.IOException:
                raise
        return self

    def close(self):
        try:
            self.out.close()
        except java.io.IOException:
            raise

class DLazyFaith:
    def solve(self, test_number, in_, out):
        a, b, q = map(int, in_.ints())
        s = [0] * (a + 2)
        t = [0] * (b + 2)
        for i in range(a):
            s[i + 1] = in_.longs()
        for i in range(b):
            t[i + 1] = in_.longs()
        s[a + 1] = t[b + 1] = 20_000_000_000L
        for _ in range(q):
            x = in_.longs()
            sl = x - s[java.util.Arrays.lowerBound(s, x + 1) - 1]
            tl = x - t[java.util.Arrays.lowerBound(t, x + 1) - 1]
            sr = s[java.util.Arrays.lowerBound(s, x)] - x
            tr = t[java.util.Arrays.lowerBound(t, x)] - x
            out.ansln(
                min(
                    max(sl, tl),
                    max(sr, tr),
                    2 * sl + tr,
                    2 * tl + sr,
                    sl + 2 * tr,
                    tl + 2 * sr
                )
            )

if __name__ == '__main__':
    in_ = LightScanner(sys.stdin.buffer())
    out = LightWriter(sys.stdout)
    solver = DLazyFaith()
    solver.solve(1, in_, out)
    out.close()


