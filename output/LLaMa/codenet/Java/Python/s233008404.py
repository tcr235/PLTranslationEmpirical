import math

class FastScanner:
    def __init__(self):
        self.reader = input

    def next(self):
        return next(self.reader).split()

    def next_int(self):
        return int(self.next()[0])

    def next_long(self):
        return int(self.next()[0])

    def next_line(self):
        return next(self.reader)

class Main:
    def __init__(self):
        self.color_mtr = None
        self.h = None
        self.w = None
        self.k = None

    def solve(self):
        fs = FastScanner()
        self.h = fs.next_int()
        self.w = fs.next_int()
        self.k = fs.next_int()

        self.color_mtr = [[char for char in row] for row in open(0).read().split('\n')]

        h_pattern = 2 ** self.h
        w_pattern = 2 ** self.w

        ans = 0

        for i in range(h_pattern):
            for j in range(w_pattern):
                if self.judge(i, j):
                    ans += 1

        print(ans)

    def judge(self, h_pattern, w_pattern):
        h_bit_arr = [0] * self.h
        w_bit_arr = [0] * self.w

        for i in range(self.h):
            if (h_pattern >> i) & 1:
                h_bit_arr[i] = 1

        for i in range(self.w):
            if (w_pattern >> i) & 1:
                w_bit_arr[i] = 1

        black = 0

        for i in range(self.h):
            for j in range(self.w):
                if h_bit_arr[i] or w_bit_arr[j]:
                    continue

                if self.color_mtr[i][j] == '#':
                    black += 1

        if black == self.k:
            return True
        else:
            return False

    def pow(self, base, n):
        return base ** n

Main().solve()