from collections import *
import sys

class FastScanner:
    def __init__(self):
        self.br = sys.stdin

    def next(self):
        tokens = self.br.readline().strip().split()
        if not tokens:
            tokens = self.br.readline().strip().split()
        return tokens.pop(0)

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextLine(self):
        return self.br.readline().strip()

def main():
    fs = FastScanner()
    n = fs.nextInt()
    map = Counter()
    for _ in range(n):
        val = fs.nextInt()
        map[val] += 1
    max_val = 0
    for value in map.values():
        max_val = max(max_val, value) if value > max_val else max_val
    print(str(max_val) + str(len(map)))

if __name__ == "__main__":
    main()