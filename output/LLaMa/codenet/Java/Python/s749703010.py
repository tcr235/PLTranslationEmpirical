```python
import sys

class Pair:
    def __init__(self, l, r):
        self.l = l
        self.r = r

    def __str__(self):
        return f"{self.l} {self.r}"

class Scanner:
    def __init__(self, input_stream):
        self.st = None
        self.br = 0
        self.lines = input_stream.read().splitlines()
        self pointers = {
            sys.stdin: 0,
            sys.stdin.buffer: 0,
        }
        if isinstance(input_stream, str):
            self.lines = input_stream.splitlines()
        elif hasattr(input_stream, 'readlines'):
            self.lines = input_stream.readlines()
        elif hasattr(input_stream, 'seek'):
            input_stream.seek(0)

    def next(self):
        while self.st is None or not self.st.hasMoreTokens():
            self.st = self.lines[self.pointers[self.br]].split()
            self.pointers[self.br] += 1
        return self.st.pop(0)

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextLine(self):
        return self.lines[self.pointers[self.br]]

    def nextDouble(self):
        return float(self.next())

class PrintWriter:
    def __init__(self, output_stream):
        self.output_stream = output_stream
        self.buffer = ""

    def println(self, x):
        self.buffer += str(x) + "\n"

    def flush(self):
        self.output_stream.write(self.buffer)
        self.buffer = ""

def dp(n, idx, msk, a):
    if msk == (1 << n) - 1:
        return 0
    if memo[n][idx][msk] != -1:
        return memo[n][idx][msk]
    x = bin(msk).count("1")
    ans = float('inf')
    for i in range(n):
        if (msk >> i) & 1 == 0:
            nf = x % 2
            if idx == n or a[n][idx] <= a[nf + (nfl % 2)][i]:
                nfl += 1
                ans = min(ans, fl + dp(nf + (nfl % 2), i, msk | 1 << i, a))
    memo[n][idx][msk] = ans
    return memo[n][idx][msk]

def