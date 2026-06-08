import sys

class Main:
    def __init__(self):
        inputs = input().split()
        self.N = int(inputs.pop(0))
        self.max = self.min = int(inputs.pop(0))
        for num in inputs:
            self.input(int(num))

    def solve(self):
        print(self.max - self.min)

    def input(self, num):
        self.max = max(self.max, num)
        self.min = min(self.min, num)

if __name__ == "__main__":
    Main().solve()