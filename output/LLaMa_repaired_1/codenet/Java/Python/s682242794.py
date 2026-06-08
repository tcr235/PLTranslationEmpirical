class Main:
    def solve(self):
        for _ in range(7):
            high, low = map(int, input().split())
            sa = high - low
            print(sa)

if __name__ == "__main__":
    Main().solve()