import sys

class FastScanner:
    def __init__(self):
        self.br = sys.stdin

    def next(self):
        while True:
            line = self.br.readline()
            if line:
                return line.strip()

    def next_line(self):
        return self.br.readline().strip()

    def next_ints(self):
        return list(map(int, self.next().split()))

def main():
    fs = FastScanner()
    n = int(fs.next())
    s = int(fs.next())
    max_val = 0
    for _ in range(n):
        f, t = fs.next_ints()
        if max_val < f + t:
            max_val = f + t
    print(max(max_val, s))

if __name__ == "__main__":
    main()