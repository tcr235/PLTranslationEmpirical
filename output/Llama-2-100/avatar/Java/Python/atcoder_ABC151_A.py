def atcoder_ABC151_A(stdin):
    r = input(1)
    s = r.readline().strip()
    print(chr(ord(s[0])+1), end='')

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
        u = 1
        v = 0
        b = self.module
        while b > 0:
            t = a // b
            a -= t * b
            u -= t * v
            b = a
            a = b
            b = u
            u = v
            v = b
        u %= self.module
        if u < 0:
            u += self.module
        return u

