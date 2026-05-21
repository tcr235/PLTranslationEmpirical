import sys
import math

class FastReader():
    def __init__(self):
        self.br = sys.stdin
        self.st = None

    def next(self):
        while self.st == None or not self.st.hasMoreElements():
            try:
                self.st = self.br.readline().split()
            except Exception as e:
                print(e)
        return self.st.pop(0)

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextLine(self):
        str = ""
        try:
            str = self.br.readline().strip()
        except Exception as e:
            print(e)
        return str

def modPower(x, y, mod):
    res = 1
    x %= mod
    if x == 0:
        return 0
    while y > 0:
        if y % 2 == 1:
            res = (res * x) % mod
        y = y >> 1
        x = (x * x) % mod
    return res

class Pair():
    def __init__(self, first, second):
        self.first = first
        self.second = second

def main():
    fr = FastReader()
    a = [fr.nextLong() for _ in range(4)]
    print(max(a[0]*a[2], max(a[1]*a[3], max(a[0]*a[3], a[1]*a[2]))))

main()