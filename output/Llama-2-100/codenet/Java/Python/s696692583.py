import sys

class Solution:
    def __init__(self):
        pass

    def run(self):
        scanner = input()
        for _ in range(sys.stdin.readline().strip()):
            my1, my2, enemy1 = map(int, input().split())
            used = [True] * 11
            used[my1] = used[my2] = used[enemy1] = True
            all = 0
            safe = 0
            for i in range(1, 11):
                if not used[i]:
                    all += 1
                    if my1 + my2 + i <= 20:
                        safe += 1
            if safe * 2 >= all:
                print("YES")
            else:
                print("NO")

    def solve(self, a):
        s = ['d', 'o', 'x']
        for side in range(2):
            for i in range(3):
                if a[i][0] == side and a[i][1] == side and a[i][2] == side:
                    return s[side]
                if a[0][i] == side and a[1][i] == side and a[2][i] == side:
                    return s[side]
            if a[0][0] == side and a[1][1] == side and a[2][2] == side:
                return s[side]
            if a[0][2] == side and a[1][1] == side and a[2][0] == side:
                return s[side]
        return 'd'

