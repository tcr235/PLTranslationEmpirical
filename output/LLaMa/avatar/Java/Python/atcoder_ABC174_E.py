import math
import sys

class InputReader:
    def __init__(self, stream):
        self.reader = stream
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer:
            try:
                self.tokenizer = self.reader.readline().split()
            except:
                raise RuntimeError
        return self.tokenizer.pop(0)

    def next_int(self):
        return int(self.next())

    def read_array(self, n):
        return [self.next_int() for _ in range(n)]


class Solution:
    def solve(self, in_reader, out):
        n = in_reader.next_int()
        k = in_reader.next_int()
        logs_length = in_reader.read_array(n)
        min_result = 1
        max_result = int(1e9) + 1000

        while min_result < max_result:
            mid = (min_result + max_result) // 2
            if self.nei(mid, logs_length, k):
                max_result = mid
            else:
                min_result = mid + 1

        out.write(f"{min_result}\n")

    def nei(self, mid, logs_length, k):
        for log in logs_length:
            k -= (log + mid - 1) // mid - 1
        return k >= 0


def main():
    in_stream = sys.stdin
    out_stream = sys.stdout
    in_reader = InputReader(in_stream)
    out_writer = sys.stdout
    solution = Solution()
    solution.solve(in_reader, out_writer)


if __name__ == "__main__":
    main()