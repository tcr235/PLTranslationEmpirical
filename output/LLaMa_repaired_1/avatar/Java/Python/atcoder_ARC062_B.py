import sys
import io

class InputReader:
    def __init__(self, stream):
        self.reader = stream
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer:
            try:
                self.tokenizer = self.reader.readline().split()
            except Exception as e:
                raise Exception(str(e))
        return self.tokenizer.pop(0)


class TaskD:
    def solve(self, testNumber, in_reader, out):
        S = in_reader.next().strip()
        score = 0
        for i in range(len(S)):
            my = 'g' if i % 2 == 0 else 'p'
            his = S[i]
            if my != his:
                score += 1 if my == 'p' else -1
        out.write(str(score) + "\n")


def main():
    input_stream = sys.stdin
    output_stream = sys.stdout
    in_reader = InputReader(io.TextIOWrapper(input_stream))
    out = io.TextIOWrapper(sys.stdout.buffer, encoding='utf-8')
    solver = TaskD()
    solver.solve(1, in_reader, out)
    out.flush()


if __name__ == "__main__":
    main()