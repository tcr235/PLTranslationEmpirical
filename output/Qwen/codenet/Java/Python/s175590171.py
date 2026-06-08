class FastScanner:
    def __init__(self):
        self.input = input().rstrip()
        self.index = 0

    def __iter__(self):
        return self

    def __next__(self):
        while self.index < len(self.input) and not self.is_printable_char(ord(self.input[self.index])):
            self.index += 1
        if self.index >= len(self.input):
            raise StopIteration
        start = self.index
        while self.index < len(self.input) and self.is_printable_char(ord(self.input[self.index])):
            self.index += 1
        token = self.input[start:self.index]
        token_type = type(int(token) if token.isdigit() else float(token))
        return token_type(token)

    def is_printable_char(self, c):
        return 33 <= c <= 126

def solve():
    scanner = FastScanner()
    n = next(scanner)
    a = [next(scanner) for _ in range(n)]
    a.sort()
    total_sum = 0
    result_count = 0
    for i in range(n - 1):
        total_sum += a[i]
        if a[i + 1] <= 2 * total_sum:
            result_count += 1
        else:
            result_count = 0
    print(result_count + 1)

if __name__ == "__main__":
    solve()