from io import StringIO
import sys

class Input:
    def __init__(self, string):
        self.i = iter(string.split())

    def next(self):
        return next(self.i)

    def next_int(self):
        return int(next(self.i))

    def next_long(self):
        return int(next(self.i))

    def next_double(self):
        return float(next(self.i))

    def next_line(self):
        return next(self.i)


def mod_power(x, y, mod):
    res = 1
    x %= mod
    if x == 0:
        return 0
    while y > 0:
        if y & 1:
            res = (res * x) % mod
        y >>= 1
        x = (x * x) % mod
    return res


def main():
    input_string = sys.stdin.read()
    reader = Input(input_string)
    a = [reader.next_int() for _ in range(4)]
    print(max(a[0] * a[2], max(a[1] * a[3], max(a[0] * a[3], a[1] * a[2]))))


if __name__ == "__main__":
    main()