MOD = 10**9 + 7

def main():
    fromsysstdin = input
    sc = FastScanner(fromsysstdin)
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

class FastScanner:
    def __init__(self, fromsysstdin):
        self.fromsysstdin = fromsysstdin
        self.input_data = fromsysstdin().strip().split(' ')
        self.cursor = 0

    def __iter__(self):
        return self

    def __next__(self):
        if self.cursor >= len(self.input_data):
            raise StopIteration
        current_item = self.input_data[self.cursor]
        self.cursor += 1
        return current_item

if __name__ == "__main__":
    import io, os, sys
    input = io.BytesIO(os.read(0, os.fstat(0).st_size)).readline
    main()