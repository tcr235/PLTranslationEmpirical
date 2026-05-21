import sys
import math

class FastScanner:
    def __init__(self):
        self.br = sys.stdin

    def next(self):
        while True:
            try:
                return self.br.readline().strip()
            except Exception as e:
                pass

    def next_int(self):
        return int(self.next())

    def next_line(self):
        return self.next()

def main():
    fs = FastScanner()
    n = fs.next_int()
    s = fs.next_int()
    max_val = 0
    while n > 0:
        n -= 1
        f, t = map(int, fs.next().split())
        if max_val < f + t:
            max_val = f + t
    print(max(max_val, s))

if __name__ == "__main__":
    main()