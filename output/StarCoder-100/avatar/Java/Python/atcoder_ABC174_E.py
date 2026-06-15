import sys
input = sys.stdin.readline

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.buf = ''
        self.pos = 0

    def char_stream(self):
        while True:
            if self.pos == len(self.buf):
                self.buf = self.stream.readline()
                self.pos = 0
            if self.buf == '':
                break
            yield self.buf[self.pos]
            self.pos += 1

    def next_int(self):
        c = self.char_stream()
        sign = 1
        if c == '-':
            sign = -1
            c = next(c)
        ret = 0
        while '0' <= c <= '9':
            ret = ret * 10 + ord(c) - ord('0')
            c = next(c)
        return sign * ret

class Solution:
    def solve(self):
        in_ = InputReader(input())
        n, k = in_.next_int(), in_.next_int()
        logs_length = in_.read_array(n)
        min_, max_ = 1, 10 ** 9 + 1000
        while min_ < max_:
            mid = (min_ + max_) // 2
            if self.nei(mid, logs_length, k):
                max_ = mid
            else:
                min_ = mid + 1
        print(min_)

    def nei(self, mid, logs_length, k):
        for log in logs_length:
            k -= (log + mid - 1) // mid - 1
        return k >= 0

Solution().solve()

