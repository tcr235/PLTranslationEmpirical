MOD = 1000000007

class FastScanner:
    def __init__(self):
        self.buffer = ''
        self.ptr = 0

    def next(self):
        while not self.buffer:
            self.buffer = sys.stdin.readline().strip()
        token, self.buffer, self.ptr = self.buffer.split()[0], self.buffer[self.ptr:], self.ptr + 1
        return token

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

class Pair:
    def __init__(self, key, value):
        self.key = key
        self.value = value

    def get_value(self):
        return self.value

    def get_key(self):
        return self.key

gcd_cache = {}

def gcd(a, b):
    if a < b:
        a, b = b, a
    if a in gcd_cache and b in gcd_cache[a]:
        return gcd_cache[a][b]
    elif b == 0:
        return a
    else:
        gcd_cache[a] = gcd_cache.get(a, {})
        gcd_cache[a][b] = gcd(b, a % b)
        return gcd_cache[a][b]

def lcm(a, b):
    return a * b // gcd(a, b)

def print_o(o):
    print(str(o))

def main():
    fs = FastScanner()
    n = fs.next_int()
    l = sorted([fs.next_int() for _ in range(n)])
    print(o := l[n // 2] - l[n // 2 - 1])

if __name__ == "__main__":
    main()