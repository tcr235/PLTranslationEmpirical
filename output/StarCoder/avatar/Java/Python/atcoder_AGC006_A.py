N = 200 + 10

def get_fail(b):
    j = 0
    f = [0] * N
    for i in range(2, len(b) + 1):
        while j > 0 and b[j + 1] != b[i]:
            j = f[j]
        if b[j + 1] == b[i]:
            j += 1
        f[i] = j
    return f

class InputReader:
    def __init__(self, stream):
        self.reader = BufferedReader(InputStreamReader(stream))
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = StringTokenizer(self.reader.readLine())
            except IOException as e:
                raise RuntimeError(e)
        return self.tokenizer.nextToken()

    def next_int(self):
        return int(self.next())

# Main function logic remains the same, but needs to adapt for Python's syntax.
n = in.nextInt()
s1 = in.next()
str_input = in.next()

cnt = 0
b = [''] * (2 * N - 1)
for i in range(n):
    b[++cnt] = str_input.charAt(i)
    b[++cnt] = s1.charAt(i)

f = get_fail(b)

len_result = min(f[cnt], min(n, n))
print(2 * n - len_result)
out.flush()