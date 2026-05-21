class RemRing:
    def __init__(self, module):
        self.module = module

    def sum(self, a, b):
        return (a + b + self.module) % self.module

    def sub(self, a, b):
        return (a - b + self.module) % self.module

    def prod(self, a, b):
        return (a * b) % self.module

    def div(self, a, b):
        return (a * self.inv(b)) % self.module

    def inv(self, a):
        mod = self.module
        u, v = 1, 0
        while mod > 0:
            t = abs(a // mod)
            a, mod = mod, a - t * mod
            u, v = v, u - t * v
        return u % self.module


def main():
    r = input()
    sl = []
    print(chr(ord(r[0]) + 1))


if __name__ == "__main__":
    main()