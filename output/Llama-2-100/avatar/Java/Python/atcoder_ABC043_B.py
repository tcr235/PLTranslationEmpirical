import sys
import string
class LightScanner:
    def __init__(self, input_stream):
        self.reader = sys.stdin.readline
        self.tokenizer = string.split
    def string(self):
        try:
            return self.tokenizer.next()
        except:
            return ""
class BUnhappyHackingABCEdit:
    def __init__(self):
        pass
    def solve(self, test_number, input_stream, output_stream):
        s = input_stream.string()
        d = ""
        for c in s:
            if c == '0':
                d += "0"
            elif c == '1':
                d += "1"
            elif c == 'B':
                if len(d) > 0:
                    d = d[:-1]
                    d.trim()
                break
        output_stream.println(d)

def main():
    input_stream = sys.stdin
    output_stream = sys.stdout
    solver = BUnhappyHackingABCEdit()
    solver.solve(1, LightScanner(input_stream), output_stream)

if __name__ == "__main__":
    main()
