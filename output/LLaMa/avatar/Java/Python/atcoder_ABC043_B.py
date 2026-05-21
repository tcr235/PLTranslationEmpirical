import sys
import builtins

class LightScanner:
    def __init__(self, in_stream):
        self.reader = in_stream

    def string(self):
        self.tokenizer = self.reader.readline().split()
        return self.tokenizer.pop(0)

class BUnhappyHackingABCEdit:
    def solve(self, test_number, in_scanner, out):
        s = in_scanner.string()
        d = []
        for c in s:
            if c == '0':
                d.append('0')
            elif c == '1':
                d.append('1')
            elif c == 'B':
                if d:
                    d.pop()
        out.write(''.join(d) + '\n')

def main():
    in_stream = sys.stdin
    out_stream = sys.stdout
    in_scanner = LightScanner(in_stream)
    solver = BUnhappyHackingABCEdit()
    solver.solve(1, in_scanner, out_stream)
    out_stream.flush()

if __name__ == "__main__":
    main()