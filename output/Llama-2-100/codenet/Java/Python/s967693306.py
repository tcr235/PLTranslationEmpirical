import sys

class Main:
    INF = 1000000000
    MOD = 1000000007
    SIZE = 1000000
    fac = [1] * SIZE
    inv = [1] * SIZE
    finv = [1] * SIZE
    sc = FastScanner()

    def solve(self):
        n = self.sc.nextInt()
        m = self.sc.nextInt()
        map = {}

        for i in range(m):
            s = self.sc.nextInt()
            c = self.sc.nextInt()
            if s in map:
                if map[s] != c:
                    print(-1)
                    sys.exit(0)
            else:
                map[s] = c

        for i in range(1000):
            s = str(i)
            flag = True
            for j in range(n):
                if (j + 1) % n == 0:
                    continue
                if s[j] != map[j + 1]:
                    flag = False
                    break
            if flag:
                print(s)
                sys.exit(0)

    def gcd(self, a, b):
        if b == 0:
            return a
        return self.gcd(b, a % b)

    def lcm(self, a, b):
        return a * b / self.gcd(a, b)

    def inv(self, a):
        return self.modFact(a)

    def pow(self, a, r):
        result = 1
        while r > 0:
            if (r & 1) == 1:
                result *= a
            a *= a
            r >>= 1
        return result

    def modFact(self, n):
        if n == 0:
            return 1
        return self.pow(n, self.MOD - 2)

    def fact(self, n):
        if n == 0:
            return 1
        return self.fact(n - 1) * n

    def initCOMB():
        self.fac[0] = 1
        self.inv[1] = 1
        self.finv[0] = 1
        for i in range(2, SIZE):
            self.fac[i] = self.fac[i - 1] * i % self.MOD
            self.inv[i] = self.MOD - self.inv[self.MOD % i] * (self.MOD / i) % self.MOD
            self.finv[i] = self.finv[i - 1] * self.inv[i] % self.MOD

    def modComb(self, n, r):
        return self.fac[n] * self.finv[r] % self.MOD * self.finv[n - r] % self.MOD

    def comb(self, n, r):
        return self.fac[n] * (n - r + 1) // r

    def isPrime(self, a):
        if a <= 1:
            return False
        for i in range(2, int(a ** 0.5) + 1):
            if a % i == 0:
                return False
        return True

    def nextPermutation(self, s):
        list = list(s)
        pivotPos = -1
        pivot = 0
        for i in range(len(list) - 2, -1, -1):
            if list[i] < list[i + 1]:
                pivotPos = i
                pivot = list[i]
                break
        if pivotPos == -1:
            return None
        L = pivotPos + 1
        R = len(list) - 1
        minPos = -1
        min = list[0]
        for i in range(R, L, -1):
            if list[i] < min:
                min = list[i]
                minPos = i
        list.insert(L, min)
        list.sort(L, R + 1)
        return ''.join(list)

    def nextPermutation(self, a):
        for i in range(len(a) - 1):
            if a[i] < a[i