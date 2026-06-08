import sys

class Scanner:
    def __init__(self, stream):
        self.stream = stream
        self.tokens = []

    def next(self):
        while not self.tokens:
            self.tokens = self.stream.readline().split()
        return self.tokens.pop(0)

    def isblank(self):
        if not self.tokens:
            return True
        elif self.tokens and self.tokens[-1].strip() == '':
            self.tokens.pop()
            return True
        return False

    def nextInt(self):
        if self.tokens:
            return int(self.tokens[0])
        return None

def main():
    scanner = Scanner(sys.stdin)
    while True:
        my1 = scanner.nextInt()
        if my1 is None: break
        my2 = scanner.nextInt()
        if my2 is None: break
        enemy1 = scanner.nextInt()
        if enemy1 is None: break
        used = [False]*11
        used[my1] = True
        used[my2] = True
        used[enemy1] = True
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

def tr(*os):
    print(str(os))

def solve(a):
    s = ['d', 'o', 'x']
    for side in range(1, 3):
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

if __name__ == "__main__":
    main()