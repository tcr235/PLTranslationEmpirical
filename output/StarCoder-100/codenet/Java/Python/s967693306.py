import sys

class Main:
    final static long INF = long(1e18)
    final static int MOD = 1_000_000_007
    final static int SIZE = 1_000_000

    def __init__(self):
        self.fac = [0] * SIZE
        self.inv = [0] * SIZE
        self.finv = [0] * SIZE
        self.sc = FastScanner()
        self.init_comb()

    def init_comb(self):
        self.fac[0] = self.fac[1] = 1
        self.inv[1] = 1
        self.finv[0] = self.finv[1] = 1
        for i in range(2, SIZE):
            self.fac[i] = self.fac[i - 1] * i % MOD
            self.inv[i] = MOD - self.inv[MOD % i] * (MOD // i) % MOD
            self.finv[i] = self.finv[i - 1] * self.inv[i] % MOD

    def solve(self):
        n = self.sc.next_int()
        m = self.sc.next_int()
        map = {}
        for i in range(m):
            s = self.sc.next_int()
            c = self.sc.next_int()
            if map.get(s)!= None and map.get(s)!= c:
                print(-1)
                sys.exit(0)
            map[s] = c

        for i in range(1000):
            s = str(i)
            if len(s) < n: continue
            flag = True
            for j in range(n):
                if (map.get(j + 1)!= None and map.get(j + 1)!= int(s[j])) or (map.get(j + 1) == None and int(s[j])!= 0):
                    if map.get(j + 1) == None and j == 0 and int(s[j]) == 1:
                        continue
                    flag = False
                    break
            if flag and len(s) == n:
                print(s)
                sys.exit(0)

        print(-1)

    def gcd(self, a, b):
        if b == 0:
            return a
        return self.gcd(b, a % b)

    def lcm(self, a, b):
        return a * b // self.gcd(a, b)

    def inv(self, a):
        return self.pow(a, MOD - 2)

    def pow(self, a, r):
        sum = 1
        while r > 0:
            if r & 1 == 1:
                sum *= a
                sum %= MOD
            a *= a
            a %= MOD
            r >>= 1
        return sum

    def mod_fact(self, n):
        if n == 0:
            return 1
        return n * self.mod_fact(n - 1) % MOD

    def fact(self, n):
        if n == 0:
            return 1
        return n * self.fact(n - 1)

    def mod_comb(self, n, r):
        if n < r or n < 0 or r < 0:
            return 0
        return self.fac[n] * self.finv[r] % MOD * self.finv[n - r] % MOD

    def comb(self, n, r):
        num = 1
        for i in range(1, r + 1):
            num = num * (n - i + 1) // i
        return num

    def is_prime(self, a):
        if a <= 1:
            return False
        for i in range(2, a):
            if a % i == 0:
                return False
        return True

    def next_permutation(self, s):
        list = []
        for i in range(len(s)):
            list.append(s[i])
        pivotPos = -1
        pivot = 0
        for i in range(len(list) - 2, -1, -1):
            if list[i] < list[i + 1]:
                pivotPos = i
                pivot = list[i]
                break
        if pivotPos == -1 and pivot == 0:
            return None
        L = pivotPos + 1
        R = len(list) - 1
        minPos = -1
        min = 1 << 60
        for i in range(R, L, -1):
            if pivot < list
