class FastScanner:
    def __init__(self):
        import sys
        input = sys.stdin.read
        data = input().split()
        self.N = int(data[0])
        self.balls = []
        for i in range(1, len(data), 2):
            self.balls.append([int(data[i]), int(data[i+1])])

    def read(self):
        from operator import itemgetter
        self.balls.sort(key=itemgetter(0))
        return self.N, self.balls

N, balls = FastScanner().read()
ans = N
taken = [False] * N

for add in range(1, N):
    p = balls[add][0] - balls[0][0]
    q = balls[add][1] - balls[0][1]
    ans = min(ans, check(p, q))

balls = [[row[i] for row in balls] for i in range(len(balls[0]))]
N, balls = FastScanner().read()
taken = [False] * N

for add in range(1, N):
    p = balls[add][0] - balls[0][0]
    q = balls[add][1] - balls[0][1]
    ans = min(ans, check(p, q))


def check(p, q):
    ret = 0
    while True:
        added = False
        start = 0
        x, y = -1, -1
        for i in range(N):
            if not taken[i]:
                added = True
                ret += 1
                start = i
                taken[i] = True
                x = balls[i][0] + p
                y = balls[i][1] + q
                break
        if not added: break
        for i in range(start + 1, N):
            if balls[i][0] == x and balls[i][1] == y:
                taken[i] = True
                x += p
                y += q
    return ret


def min_val(a, b):
    return min(a, b)


print("ans =", min_val(ans, some_value))  # Replace 'some_value' with the actual value you want to compare against