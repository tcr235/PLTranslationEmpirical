class FastReader:
    def __init__(self):
        self.br = input()

    def next(self):
        return self.br

    def next_int(self):
        return int(self.br)

    def next_long(self):
        return int(self.br)

    def next_double(self):
        return float(self.br)

    def next_line(self):
        return self.br


def mod_power(x, y, mod):
    res = 1
    x %= mod
    if x == 0:
        return 0
    while y > 0:
        if y % 2 == 1:
            res = (res * x) % mod
        y = y >> 1
        x = (x * x) % mod
    return res


class Pair:
    def __init__(self, first, second):
        self.first = first
        self.second = second


def main():
    reader = FastReader()
    a = [reader.next_long() for _ in range(4)]
    print(max(a[0] * a[2], max(a[1] * a[3], max(a[0] * a[3], a[1] * a[2]))))


if __name__ == "__main__":
    main()