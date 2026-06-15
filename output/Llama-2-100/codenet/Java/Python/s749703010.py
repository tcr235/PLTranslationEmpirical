import java.util
import java.io

class Pair:
    def __init__(self, a, b):
        self.l = a
        self.r = b

    def __str__(self):
        return f"{self.l} {self.r}"

class Scanner:
    def __init__(self, file):
        self.br = file
        self.st = None

    def next(self):
        if self.st is None or not self.st.hasMoreTokens():
            self.st = StringTokenizer(self.br.readLine())
        return self.st.nextToken()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

    def nextLine(self):
        return self.br.readLine()

    def nextDouble(self):
        return double(self.next())

    def ready(self):
        return self.br.ready()

class Main:
    def __init__(self):
        self.n = int(input())
        self.a = [list(map(int, input().split())) for _ in range(2)]
        self.memo = [[[0 for _ in range(1 << self.n)] for _ in range(2)] for _ in range(self.n + 1)]

    def dp(self, fliped, idx, msk):
        if msk == (1 << self.n) - 1:
            return 0
        if self.memo[fliped][idx][msk] != -1:
            return self.memo[fliped][idx][msk]
        x = len(bin(msk)) - 1
        ans = 1e9
        for i in range(self.n):
            if not msk & (1 << i):
                nf = x % 2
                if idx == self.n or self.a[fliped][idx] <= self.a[(nf + (fliped % 2)) % 2][i]:
                    ans = min(ans, x + self.dp((nf + (fliped % 2)) % 2, i, msk | (1 << i)))
        return self.memo[fliped][idx][msk] = ans

    def main(self):
        sc = Scanner(input())
        pw = PrintWriter(output())
        ans = self.dp(0, self.n, 0)
        pw.println(ans >= 1e8 ? -1 : ans)
        pw.flush()

if __name__ == "__main__":
    Main().main()
