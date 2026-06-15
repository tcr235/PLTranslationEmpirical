import sys

class Main:
    def __init__(self):
        self.in = sys.stdin
        self.out = sys.stdout

    def input(self):
        return self.in.readline().strip()

    def read(self):
        return self.in.read().strip()

    def readInt(self):
        return int(self.input())

    def readLong(self):
        return long(self.input())

    def readArray(self):
        return [int(x) for x in self.read().split()]

    def readStrArray(self):
        return self.read().split()

    def readIntArray(self):
        return [int(x) for x in self.read().split()]

    def readLongArray(self):
        return [long(x) for x in self.read().split()]

    def write(self, str):
        self.out.write(str)

    def flush(self):
        self.out.flush()

    def println(self, str=''):
        self.write(str + '\n')

    def printArray(self, array):
        self.println(' '.join([str(x) for x in array]))

    def printStrArray(self, array):
        self.println(' '.join(array))

    def printIntArray(self, array):
        self.printArray(array)

    def printLongArray(self, array):
        self.printArray(array)

    def main(self):
        m = self.readInt()
        n = self.readInt()
        manju = self.readIntArray()
        boxlen = self.readIntArray()
        boxcost = self.readIntArray()
        self.sort(manju)
        dp = [[0 for _ in range(n + 1)] for _ in range(m + 1)]
        for i in range(m - 1, -1, -1):
            for j in range(n - 1, -1, -1):
                len = i + boxlen[j] if i + boxlen[j] < m else m
                cnt = 0
                for k in range(i, len):
                    cnt += manju[m - 1 - k]
                dp[i][j] = max(dp[i][j], dp[len][j + 1] + cnt - boxcost[j])
                dp[i][j] = max(dp[i][j], dp[i][j + 1])
        self.println(dp[0][0])

    def sort(self, a):
        for i in range(len(a) - 1, 0, -1):
            t = int(random.random() * i)
            temp = a[i]
            a[i] = a[t]
            a[t] = temp
        a.sort()


if __name__ == '__main__':
    m = Main()
    m.main()

