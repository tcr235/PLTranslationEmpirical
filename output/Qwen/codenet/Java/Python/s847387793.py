class FastScanner:
    def __init__(self):
        import sys
        self.sys = sys

    def read(self):
        return self.sys.stdin.buffer.readline().decode('ascii')

    def readline(self):
        data = self.sys.stdin.buffer.readline().split()
        cur = 0
        while True:
            try:
                self.current = int(data[cur])
                cur += 1
            except ValueError:
                try:
                    self.current = float(data[cur])
                    cur += 1
                except ValueError:
                    try:
                        self.current = str(data[cur])
                        cur += 1
                    except IndexError:
                        raise IOError('Input Not Found')
                    break

    @property
    def input(self):
        self.readline()
        return self.current


def solve():
    sc = FastScanner()
    print("", end="")
    n = sc.input
    m = sc.input
    q = sc.input
    a = [0]*q
    b = [0]*q
    c = [0]*q
    d = [0]*q
    for i in range(q):
        a[i] = sc.input
        b[i] = sc.input
        c[i] = sc.input
        d[i] = sc.input
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
            last_value = new_arr.pop()
            new_arr.append(last_value + 1)

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