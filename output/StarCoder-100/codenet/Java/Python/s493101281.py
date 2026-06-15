import sys

MOD = 1000000007

class Main:
    def __init__(self):
        self.sc = FastScanner()
        self.out = sys.stdout

    def solve(self):
        n = self.sc.nextInt()
        l = []
        for i in range(n):
            l.append(self.sc.nextInt())
        l.sort()
        print(l[n//2]-l[n//2-1])

    def __call__(self):
        self.solve()

class FastScanner:
    def __init__(self):
        self.buffer = []
        self.index = 0
        self.read_buffer()

    def read_buffer(self):
        self.buffer = sys.stdin.readline().strip()
        self.index = 0

    def has_next(self):
        if self.index < len(self.buffer):
            return True
        else:
            return False

    def next(self):
        if not self.has_next():
            return None
        result = self.buffer[self.index]
        self.index += 1
        if not self.has_next():
            self.read_buffer()
        return result

    def next_int(self):
        int_value = 0
        is_positive = True
        if not self.has_next():
            return None
        c = self.next()
        if c == '-':
            is_positive = False
        elif c not in ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']:
            return None
        while self.has_next():
            c = self.next()
            if c not in ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']:
                break
            int_value = int_value * 10 + int(c)
        if not is_positive:
            int_value = -int_value
        if int_value > 2147483647:
            return None
        return int_value

if __name__ == '__main__':
    main = Main()
    main()
