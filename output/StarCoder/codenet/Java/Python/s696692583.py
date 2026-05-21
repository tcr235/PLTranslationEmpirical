def deep_to_string(l):
    from pprint import pformat
    return str(pformat(l))

class Main:
    def __init__(self):
        self.scanner = input

    def tr(self, *os):
        print(str(deep_to_string(os)), file=sys.stderr)

    def run(self):
        while True:
            try:
                my1 = int(self.scanner())
                my2 = int(self.scanner())
                enemy1 = int(self.scanner())
                used = [False] * 11
                used[my1] = True
                used[my2] = True
                used[enemy1] = True
                all_tiles = 0
                safe_tiles = 0
                for i in range(1, 11):
                    if not used[i]:
                        all_tiles += 1
                        if my1 + my2 + i <= 20:
                            safe_tiles += 1
                if safe_tiles * 2 >= all_tiles:
                    print("YES")
                else:
                    print("NO")
            except EOFError:
                break

    def solve(self, a):
        s = ['d', 'o', 'x']
        for side in range(1, 3):
            if all(a[i][j] == side for i in range(3) for j in range(3)):
                return s[side]
        for i in range(3):
            if all(a[j][i] == side for j in range(3)):
                return s[side]
        if all(a[i][i] == side for i in range(3)):
            return s[side]
        if all(a[i][2 - i] == side for i in range(3)):
            return s[side]
        return 'd'

# Usage
if __name__ == "__main__":
    instance = Main()
    instance.run()