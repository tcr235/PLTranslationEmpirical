```python
class Main:
    def main(self):
        from sys import stdin, stdout
        in_stream = stdin
        out_stream = stdout
        in_scanner = LightScanner(in_stream)
        out_writer = LightWriter(out_stream)
        solver = DLazyFaith()
        solver.solve(1, in_scanner, out_writer)
        out_writer.close()

class DLazyFaith:
    def solve(self, test_number, in_scanner, out_writer):
        a = in_scanner.ints()
        b = in_scanner.ints()
        q = in_scanner.ints()
        s = [-10_000_000_000L] * (a + 2)
        t = [-10_000_000_000L] * (b + 2)
        
        for i in range(a):
            s[i + 1] = in_scanner.longs()
            
        for i in range(b):
            t[i + 1] = in_scanner.longs()
        
        s[a + 1] = t[b + 1] = 20_000_000_000L
        
        for i in range(q):
            x = in_scanner.longs()
            sl = x - s[max(0, ArrayUtil.lower_bound(s, x + 1) - 1)]
            tl = x - t[max(0, ArrayUtil.lower_bound(t, x + 1) - 1)]
            sr = s[ArrayUtil.lower_bound(s, x)] - x
            tr = t[ArrayUtil.lower_bound(t, x)] - x
            
            result = IntMath.min(max(sl, tl), max(sr, tr), 2 * sl + tr, 2 * tl + sr, sl + 2 * tr, tl + 2 * sr)
            
            out_writer.ansln(result)

class LightScanner:
    def __init__(self, in_stream):
        self.reader = BufferedReader(InputStreamReader(in_stream))

    def string(self):
        return next(self.tokenizer)

    def ints(self):
        return int(self.string())

    def longs(self):
        return long(self.string())

class BufferedReader:
    def __init__(self, input_stream_reader):
        self.input_stream_reader = input_stream_reader
        self.buffer = ''
        self.index = 0

    def readLine(self):
        while '\n'