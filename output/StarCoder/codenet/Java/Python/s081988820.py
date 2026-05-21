class Main:
    def __init__(self):
        self.scanner = Scanner()

    def solve(self):
        H = self.scanner.next()
        W = self.scanner.next()
        c = [[self.scanner.next() for _ in range(10)] for _ in range(10)]
        min_vals = [c[i][1] for i in range(10)]

        for tc in range(10):
            for i in range(10):
                for j in range(10):
                    min_vals[i] = min(min_vals[i], c[i][j] + min_vals[j])

        ans = 0
        for h in range(1, H+1):
            for w in range(1, W+1):
                A = self.scanner.next()
                if A >= 0:
                    ans += min_vals[A]

        print(ans)

class Scanner:
    def __init__(self):
        import sys
        self.input_stream = sys.stdin.read().split()

    def next_value(self, type=int):
        return type(self.input_stream.pop(0))

    def has_next_value(self):
        return len(self.input_stream) > 0

    def next(self):
        return self.next_value(str)

    def next_int(self):
        return self.next_value(int)

# Assuming other classes like MobiusFunction, CombCalculator, etc., are implemented similarly.

if __name__ == "__main__":
    main_instance = Main()
    main_instance.solve()