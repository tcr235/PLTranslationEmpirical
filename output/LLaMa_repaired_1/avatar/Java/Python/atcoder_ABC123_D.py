import sys

class Scanner:
    def __init__(self):
        self.tokens = sys.stdin.read().split()

    def next(self):
        if not self.tokens:
            return None
        return self.tokens.pop(0)

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_ints(self, n):
        return [self.next_int() for _ in range(n)]

def main():
    sc = Scanner()
    x = sc.next_ints(3)
    max_val = max(x)
    k = sc.next_int()

    a = []
    for i in range(3):
        arr = []
        for j in range(x[i]):
            arr.append(sc.next_long())
        arr.sort(reverse=True)
        a.append(arr)

    ans = []
    for i in range(x[0]):
        for j in range(x[1]):
            for m in range(x[2]):
                if (i + 1) * (j + 1) * (m + 1) <= k:
                    tmp = a[0][i] + a[1][j] + a[2][m]
                    ans.append(tmp)

    ans.sort(reverse=True)
    for i in range(k):
        print(ans[i])

if __name__ == "__main__":
    main()