from io import StringIO

class FastScanner:
    def __init__(self, file=None):
        self.file = file or StringIO("".join(map(input, [""] * int(input()))))

    def read(self):
        return self.file.readline().decode('ascii').strip()

    def readline(self):
        data = self.file.readline().strip().split()
        self.idx = 0
        if len(data) > 0:
            self.current = data[self.idx]
            self.idx += 1

    @property
    def input(self):
        if hasattr(self, 'current'):
            return self.current
        else:
            self.readline()
            return self.current


def solve():
    sc = FastScanner()
    print("", end="")
    n = int(sc.read())
    m = int(sc.read())
    q = int(sc.read())
    a = [0] * q
    b = [0] * q
    c = [0] * q
    d = [0] * q
    for i in range(q):
        a[i] = int(sc.read())
        b[i] = int(sc.read())
        c[i] = int(sc.read())
        d[i] = int(sc.read())
    array = [1]
    max_score = 0

    def dfs(arr):
        nonlocal max_score
        if len(arr) > n:
            score = calculate_score(arr, a, b, c, d, q)
            max_score = max(max_score, score)
            return
        new_arr = arr[:]
        new_arr.append(arr[-1])

        while new_arr[-1] <= m:
            dfs(new_arr)
            new_arr.pop()
            new_arr.append(new_arr[-1] + 1)

    def calculate_score(arr, a, b, c, d, q):
        score = 0
        for i in range(q):
            if arr[b[i]-1] - arr[a[i]-1] == c[i]:
                score += d[i]
        return score

    dfs(array)
    print(max_score)


if __name__ == "__main__":
    solve()