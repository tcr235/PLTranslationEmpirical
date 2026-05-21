import sys

class Main:
    def __init__(self):
        self.N = int(input())
        self.max = self.min = int(input())

    def solve(self):
        for _ in range(1, self.N):
            self.input()

    def input(self):
        self.num = int(input())
        self.max = max(self.max, self.num)
        self.min = min(self.min, self.num)

        if _ == self.N - 1:
            print(self.max - self.min)

if __name__ == "__main__":
    Main().solve()