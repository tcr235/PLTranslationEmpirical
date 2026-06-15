import sys

class atcoder_ABC128_C:
    def __init__(self):
        self.sc = sys.stdin.readline
        self.p = 0
        self.ans = 0
        self.N = 0
        self.M = 0
        self.a = []

    def run(self):
        self.N = int(self.sc())
        self.M = int(self.sc())
        self.a = [0 for _ in range(self.N)]
        for i in range(self.M):
            k = int(self.sc())
            for j in range(k):
                s = int(self.sc())
                s -= 1
                self.a[s] |= (1 << i)
        self.p = int(self.sc())
        for i in range(self.M):
            x = int(self.sc())
            self.p |= (x << i)
        for s in range(1 << self.N):
            t = 0
            for i in range(self.N):
                if (s >> i) & 1:
                    t ^= self.a[i]
            if self.p == t:
                self.ans += 1
        print(self.ans)

if __name__ == '__main__':
    obj = atcoder_ABC128_C()
    obj.run()

