def deep_to_string(lst):
    from pprint import pformat
    return pformat(lst)

class Main:
    def __init__(self):
        self.scanner = raw_input  # Use raw_input for Python 2 compatibility

    def tr(self, *os):
        print(deep_to_string(os), file=sys.stderr)

    def run(self):
        while True:
            try:
                my1 = map(int, self.scanner().split())  # Input can be multiple numbers separated by spaces
                my2, enemy1 = map(int, self.scanner().split())
                used = [False] * 11
                used[my1[0]] = True
                used[my1[1]] = True
                used[enemy1] = True
                all_tiles = 0
                safe_tiles = 0
                for i in range(1, 11):
                    if not used[i]:
                        all_tiles += 1
                        if sum(my1) + i <= 20:
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
            if all(row[i] == side for row in a for i in range(3)):
                return s[side]
        for i in range(3):
            if all(col[i] == side for col in a):
                return s[side]
        if all(diag[i] == side for i, diag in enumerate([a[i][i] for i in range(3)])):
            return s[side]
        if all(off_diag[i] == side for i, off_diag in enumerate([a[2 - i][i] for i in range(3)])):
            return s[side]
        return 'd'

# Usage
if __name__ == "__main__":
    instance = Main()
    instance.run()