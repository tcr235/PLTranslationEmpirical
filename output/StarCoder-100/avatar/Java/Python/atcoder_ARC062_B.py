import sys
import io
import atexit
sys.stdin = io.TextIOWrapper(sys.stdin.buffer, encoding='utf-8')
sys.stdout = io.TextIOWrapper(sys.stdout.buffer, encoding='utf-8')

class TaskD:
    def __init__(self):
        pass

    def solve(self, testNumber, in, out):
        S = in.next()
        score = 0
        for i in range(len(S)):
            my = 'g' if i % 2 == 0 else 'p'
            his = S[i]
            if my!= his:
                score += 1 if my == 'p' else -1
        out.println(score)

class InputReader:
    def __init__(self, stream):
        self.reader = io.TextIOWrapper(stream.buffer, encoding='utf-8')
        self.tokenizer = None

    def next(self):
        while self.tokenizer == None or not self.tokenizer.hasMoreTokens():
            self.tokenizer = StringTokenizer(self.reader.readLine())
        return self.tokenizer.nextToken()

if __name__ == '__main__':
    solver = TaskD()
    solver.solve(1, InputReader(sys.stdin), sys.stdout)

