import sys

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
        while self.tokenizer == None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = self.reader.readline().split()
            except:
                raise Exception("Error reading from input")
        return self.tokenizer.pop(0)

    def nextInt(self):
        return int(self.next())

def main():
    inStream = InputReader(sys.stdin)
    n = inStream.nextInt()
    s1 = inStream.next()
    str = inStream.next()
    cnt = 0
    for i in range(n):
        b[cnt] = str[i]
        cnt += 1
    for i in range(n):
        b[cnt] = s1[i]
        cnt += 1
    getFail(b, cnt)
    len = min(f[cnt], min(n, n))
    print(2 * n - len)
    sys.stdout.flush()

if __name__ == "__main__":
    main()