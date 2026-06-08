class Main:
    ans = 100
    balls = []
    N = 0
    taken = []

    def __init__(self):
        self.fast_scanner()
        self.solve()
        self.balls = self.transpose()
        self.taken = [False] * self.N
        self.solve()
        print(self.ans)

    def fast_scanner(self):
        import sys
        input = sys.stdin.read
        data = input().split()
        self.N = int(data[0])
        for i in range(1, len(data), 2):
            self.balls.append([int(data[i]), int(data[i+1])])
        self.sorted_balls()

    def sorted_balls(self):
        from operator import itemgetter
        self.balls.sort(key=itemgetter(0))
        self.solve()

    def transpose(self):
        return [[row[i] for row in self.balls] for i in range(len(self.balls[0]))]

    def solve(self):
        for add in range(1, self.N):
            self.taken = [False] * self.N
            p = self.balls[add][0] - self.balls[0][0]
            q = self.balls[add][1] - self.balls[0][1]
            self.ans = min(self.ans, self.check(p, q))

    def check(self, p, q):
        ret = 0
        while True:
            added = False
            start = 0
            x, y = -1, -1
            for i in range(self.N):
                if not self.taken[i]:
                    added = True
                    ret += 1
                    start = i
                    self.taken[i] = True
                    x = self.balls[i][0] + p
                    y = self.balls[i][1] + q
                    break
            if not added: break
            for i in range(start + 1, self.N):
                if self.balls[i][0] == x and self.balls[i][1] == y:
                    self.taken[i] = True
                    x += p
                    y += q
        return ret

def min_val(a, b):
    return min(a, b)

print("ans =", min_val(ans, some_value))  # Replace 'some_value' with the actual value you want to compare against