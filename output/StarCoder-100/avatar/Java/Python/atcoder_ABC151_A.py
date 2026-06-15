import sys

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
        b = self.module
        u = 1
        v = 0
        while b > 0:
            t = a // b
            a -= t * b
            u -= t * v
            z = a
            a = b
            b = z
            z = u
            u = v
            v = z
        u %= self.module
        if u < 0:
            u += self.module
        return u

class atcoder_ABC151_A:
    def main(self):
        r = sys.stdin.readline()
        s = r.rstrip()
        sl = list(s)
        print(chr(ord(sl[0]) + 1), end="")

if __name__ == '__main__':
    atcoder_ABC151_A().main()

