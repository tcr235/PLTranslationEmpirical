import sys

class Solver:
    def __init__(self, reader, writer):
        self.reader = reader
        self.writer = writer

    def run(self):
        n = self.reader.next_int()
        m = self.reader.next_int()
        q = self.reader.next_int()
        a = self.reader.next_int_array(q)
        b = self.reader.next_int_array(q)
        c = self.reader.next_int_array(q)
        d = self.reader.next_int_array(q)
        self.dfs(1, [1])
        self.writer.println(self.max)

    def dfs(self, score, array):
        if len(array) > n:
            score = 0
            for i in range(q):
                if array[b[i]] - array[a[i]] == c[i]:
                    score += d[i]
            self.max = max(self.max, score)
            return
        newArray = array + [array[-1]]
        while newArray[-1] <= m:
            self.dfs(score, newArray)
            newArray[-1] += 1

class Reader:
    def __init__(self, stream):
        self.stream = stream
        self.buf = ""
        self.pos = 0

    def next_int(self):
        while True:
            if self.pos == len(self.buf):
                self.buf = self.stream.readline()
                self.pos = 0
            if self.pos == len(self.buf):
                return None
            c = self.buf[self.pos]
            self.pos += 1
            if c.isdigit():
                return int(c)

    def next_int_array(self, n):
        a = [None] * n
        for i in range(n):
            a[i] = self.next_int()
        return a

class Writer:
    def __init__(self, stream):
        self.stream = stream

    def println(self, x):
        self.stream.write(str(x) + "\n")

def main():
    reader = Reader(sys.stdin)
    writer = Writer(sys.stdout)
    solver = Solver(reader, writer)
    solver.run()

if __name__ == "__main__":
    main()

