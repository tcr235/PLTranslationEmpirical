import sys
import math

class Main:
    def __init__(self):
        self.scanner = Scanner(sys.stdin.read())

    def solve(self):
        H = self.scanner.next_int()
        W = self.scanner.next_int()
        c = [[self.scanner.next_int() for _ in range(W)] for _ in range(H)]
        min_vals = [c[h][1] for h in range(H)]

        for _ in range(10):
            for h in range(H):
                for w in range(W):
                    min_vals[h] = min(min_vals[h], c[h][w] + min_vals[w])

        ans = 0
        for h in range(1, H+1):
            for w in range(1, W+1):
                A = self.scanner.next_int()
                if A >= 0:
                    ans += min_vals[A]

        print(ans)

class Scanner:
    def __init__(self, input_string):
        self.input_stream = iter(input_string.split())

    def next_value(self, type=int):
        return type(next(self.input_stream))

    def has_next_value(self):
        try:
            next(self.input_stream)
            return True
        except StopIteration:
            return False

    def next(self):
        return self.next_value(str)

    def next_int(self):
        return self.next_value(int)

    def next_long(self):
        return self.next_value(int)

if __name__ == "__main__":
    main_instance = Main()
    main_instance.solve()