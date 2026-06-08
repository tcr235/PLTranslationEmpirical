class Main:
    def solve(self):
        for _ in range(7):
            high = int(input())
            low = int(input())
            sa = high - low
            print(sa)

if __name__ == "__main__":
    obj = Main()
    obj.solve()