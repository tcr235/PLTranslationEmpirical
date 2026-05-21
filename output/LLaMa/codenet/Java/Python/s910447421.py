```python
import math
import sys

def input_int():
    return int(input())

def input_int_list():
    return list(map(int, input().split()))

def input_list():
    return list(input().strip())

class OutPut:
    def __init__(self):
        self.w = sys.stdout.write

    def pln(self, x):
        print(x, file=self.w, end="\n")
        self.w.flush()

class FastScanner:
    def __init__(self):
        self.br = open("input.txt", "r")
        self.st = ""

    def next(self):
        while not self.st:
            try:
                self.st = self.br.readline().split()
            except:
                pass
        return self.st.pop(0)

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

def main():
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
        ans = min(ans, check(p, q, taken))

def check(p, q, taken):
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
            if balls[i][