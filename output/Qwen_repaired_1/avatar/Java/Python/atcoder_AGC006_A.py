N = 200 + 10

def get_fail(b):
    j = 0
    f = [0] * N
    for i in range(2, len(b) + 1):
        while j > 0 and b[j] != b[i - 1]:
            j = f[j - 1]
        if b[j] == b[i - 1]:
            j += 1
        f[i - 1] = j
    return f

class InputReader:
    def __init__(self, stream):
        self.reader = BufferedReader(InputStreamReader(stream))
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = StringTokenizer(self.reader.readLine())
            except EOFError:
                raise ValueError("Unexpected end of input")
        return self.tokenizer.nextToken()

    def next_int(self):
        return int(self.next())

# Main function logic remains the same, but needs to adapt for Python's syntax.
n = InputReader(sys.stdin).next_int()
s1 = InputReader(sys.stdin).next()
str_input = InputReader(sys.stdin).next()

cnt = 0
b = [''] * (2 * N - 1)
for i in range(n):
    b[cnt + 1] = str_input[i]
    b[cnt + 2] = s1[i]
    cnt += 2

f = get_fail(b)

len_result = min(f[cnt], min(n, n))
print(2 * n - len_result)