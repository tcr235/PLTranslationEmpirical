```python
class Main:
    class Solver:
        def __init__(self, sc, writer):
            self.sc = sc
            self.writer = writer

        def run(self):
            self.n = self.sc.nextInt()
            self.m = self.sc.nextInt()
            self.q = self.sc.nextInt()
            self.a = [0] * self.q
            self.b = [0] * self.q
            self.c = [0] * self.q
            self.d = [0] * self.q

            for i in range(self.q):
                self.a[i] = self.sc.nextInt()
                self.b[i] = self.sc.nextInt()
                self.c[i] = self.sc.nextInt()
                self.d[i] = self.sc.nextInt()

            self.dfs([1])
            self.writer.write(str(self.max) + "\n")
            self.writer.flush()

        def dfs(self, array):
            if len(array) > self.n:
                score = 0
                for i in range(self.q):
                    if self.b[i] - self.a[i] == self.c[i]:
                        score += self.d[i]
                self.max = max(self.max, score)
                return

            # Append an item to the existing array
            new_array = array[:]
            new_array.append(new_array[-1] + 1)

            while new_array[-1] <= self.m:
                self.dfs(new_array)
                new_array[-1] += 1

    class FastScanner:
        def __init__(self):
            self.in_stream = sys.stdin
            self.buffer = bytearray(1024)
            self.ptr = 0
            self.buflen = 0

        def hasNextByte(self):
            if self.ptr < self.buflen:
                return True
            else:
                self.ptr = 0
                try:
                    self.buflen = self.in_stream.readinto(self.buffer)
                except IOError as e:
                    print(e, file=sys.stderr)
                if self.buflen <= 0:
                    return False
            return True

        def readByte(self):
            if self.hasNextByte():
                return self.buffer[self.ptr]
            else:
                return -1

        def isPrintableChar(self, c):
            return 33 <= c and c <= 126

        def hasNext(self):
            while self.hasNextByte() and not self.isPrintableChar(self.buffer[self.ptr]):
                self.ptr += 1
            return self.hasNextByte()

        def