```python
import math

def max(a, b):
    return max(a, b)

def min(a, b):
    return min(a, b)

def solve():
    fs = FastScanner()
    out = OutPut()
    N = fs.next_int()
    ans = N
    balls = [[fs.next_int(), fs.next_int()] for _ in range(N)]
    balls.sort(key=lambda x: x[0])
    solve(balls, ans)
    for ball in balls:
        ball[0], ball[1] = ball[1], ball[0]
    balls.sort(key=lambda x: x[0])
    solve(balls, ans)
    out.pln(ans)

def solve(balls, ans):
    global N
    N = len(balls)
    for add in range(1, N):
        taken = [False for _ in range(N)]
        p = balls[add][0] - balls[0][0]
        q = balls[add][1] - balls[0][1]
        ans = min(ans, check(p, q, N, taken))

def check(p, q, N, taken):
    ret = 0
    while True:
        added = False
        start = 0
        x = -1
        y = -1
        for i in range(N):
            if not taken[i]:
                added = True
                ret += 1
                start = i
                taken[i] = True
                x = balls[i][0] + p
                y = balls[i][1] + q
                break
        if not added:
            break
        for i in range(start + 1, N):
            if balls[i][0] == x and balls[i][1] == y:
                taken[i] = True
                x += p
                y += q
        while start < N and balls[start][0] == x and balls[start][1] == y:
            start += 1
        if start == N:
            break
        if start != i + 1 and i != 0:
            return ret
    return ret

def min_int(a, b):
    return min(a, b)

def max_int(a, b):
    return max(a, b)

class FastScanner:
    def __init__(self):
        self.br = open("input.txt", "r")
        self.st = ""

    def next(self):
        while not self