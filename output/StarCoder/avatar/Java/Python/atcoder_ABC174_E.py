import sys

class InputReader:
    def __init__(self, input_stream):
        self.input = input_stream
        self.tokens = []

    def next(self):
        if not self.tokens:
            self.tokens = list(sys.stdin.readline().split())
            del self.tokens[0]  # Remove the number of elements which is always present.
        return self.tokens.pop(0)

    def next_int(self):
        return int(self.next())

    def read_array(self, n):
        return [int(self.next()) for _ in range(n)]

class Solution:
    def solve(self, in_reader, out_writer):
        n = in_reader.next_int()
        k = in_reader.next_int()
        logs_length = in_reader.read_array(n)
        
        min_val = 1
        max_val = 10**9 + 1000
        
        while min_val < max_val:
            mid = (min_val + max_val) // 2
            if self.nei(mid, logs_length, k):
                max_val = mid
            else:
                min_val = mid + 1
        
        out_writer.write(str(min_val))

    def nei(self, mid, logs_length, k):
        total_logs = sum((log + mid - 1) // mid - 1 for log in logs_length)
        return k >= total_logs

# Read input and write output streams.
in_stream = sys.stdin
out_stream = sys.stdout

reader = InputReader(in_stream)
writer = writer(out_stream)
solution = Solution()

solution.solve(reader, writer)

sys.stdout.flush()