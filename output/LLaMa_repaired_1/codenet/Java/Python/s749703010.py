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
        self.pointers = {
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
        while self.st is None or not self.st:
            self.st = self.lines[self.br].split()
            self.br += 1
        return self.st.pop(0)

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextLine(self):
        return self.lines[self.br - 1]

    def nextDouble(self):
        return float(self.next())

class PrintWriter:
    def __init__(self, output_stream=False):
        self.output_stream = output_stream
        self.buffer = ""

    def println(self, x):
        self.buffer += str(x) + "\n"

    def flush(self):
        if self.output_system:
            sys.stdout.write(self.buffer)
        self.buffer = ""

def main():
    scanner = Scanner(sys.stdin)
    pw = PrintWriter(sys.stdout)
    n = scanner.nextInt()
    a = [[0 for _ in range(n)] for _ in range(2)]
    for i in range(n):
        a[0][i] = scanner.nextInt()
    for i in range(n):
        a[1][i] = scanner.nextInt()
    global memo, nfl
    nfl = 0
    memo = [[[float('inf')] * (1 << n) for _ in range(n + 1)] for _ in range(2)]
    for mem in memo:
        for m in mem:
            for _ in m:
                m[_] = float('inf')
    ans = float('inf')
    for i in range(n):
        ans = min(ans, dp(0, n, 0, a))
    if ans >= 1e8:
        pw.println