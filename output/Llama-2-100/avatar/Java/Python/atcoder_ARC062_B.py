import sys
import io
import string
class TaskD:
    def solve(self, test_number, input_stream, output_stream):
        S = input_stream.readline()
        score = 0
        for i in range(len(S)):
            my = i % 2 == 0 and 'g' or 'p'
            his = S[i]
            if my != his:
                score += my == 'p' and 1 or -1
        output_stream.write(f"{score}\n")

class InputReader:
    def __init__(self, stream):
        self.reader = stream
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = string.StringTokenizer(self.reader.readline())
            except io.IOException:
                raise RuntimeError()
        return self.tokenizer.nextToken()

def main():
    input_stream = sys.stdin
    output_stream = sys.stdout
    solver = TaskD()
    solver.solve(1, InputReader(input_stream), output_stream)

if __name__ == "__main__":
    main()
