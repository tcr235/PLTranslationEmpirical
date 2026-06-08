MOD = 10**9 + 7

def main():
    sc = FastScanner()
    out = sys.stdout.write
    n = int(next(sc))
    
    l = [int(next(sc)) for _ in range(n)]
    l.sort()

    ans = l[n//2] - l[n//2-1]

    out(str(ans))
    out("\n")

def gcd(m, n):
    if n == 0:
        return m
    return gcd(n, m % n)

def lcm(m, n):
    return m * n // gcd(m, n)

class FastScanner(io.StringIO):
    def __init__(self):
        super().__init__(input())

    def next(self):
        return self.readline().strip()

if __name__ == "__main__":
    import io
    input = io.BytesIO(os.read(0, os.fstat(0).st_size)).readline
    main()