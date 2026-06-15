import sys

class Main:
    def __init__(self):
        self.scanner = sys.stdin.readline
        self.n = int(self.scanner())
        self.s = ".,!? :abc:def:ghi:jkl:mno:pqrs:tuv:wxyz".split(":")
        self.k = [char * len(self.s[i]) for i in range(9)]
        for i in range(9):
            self.k[i] = self.s[i].encode("ascii", "ignore")
        while self.n > 0:
            self.c = self.scanner().encode("ascii", "ignore")
            self.l = -1
            for i in range(len(self.c)):
                if self.c[i] != "0":
                    self.a = ord(self.c[i]) - ord("1")
                    self.l = (self.l + 1) % len(self.k[self.a])
                elif self.l >= 0:
                    print(self.k[self.a][self.l], end="")
                    self.l = -1
            print()
            self.n -= 1

