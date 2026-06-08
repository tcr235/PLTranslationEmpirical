import sys
import math

N = 200 + 10
f = [0] * N
b = [''] * N

def getFail(b, m):
    j = 0
    f[0] = f[1] = 0
    for i in range(2, m + 1):
        while j > 0 and b[j + 1] != b[i]:
            j = f[j]
        if b[j + 1] == b[i]:
            j += 1
        f[i] = j

class InputReader:
    def __init__(self, stream):
        self.reader = sys.stdin
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None:
            try:
                self.tokenizer = next(self.reader).split()
            except StopIteration:
                raise Exception("Error reading from input")
        return self.tokenizer.pop(0)

    def nextInt(self):
        return int(self.next())

def main():
    inStream = InputReader(sys.stdin.readline)
    n = inStream.nextInt()
    b[0] = inStream.next()
    b[1] = inStream.next()
    cnt = 2
    for i in range(n):
        b[cnt] = inStream.next()
        cnt += 1
    getFail(b, cnt - 1)
    len = min(f[cnt - 1], min(n, n))
    print(2 * n - len)

if __name__ == "__main__":
    main()