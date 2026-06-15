import random

class Main:
    def __init__(self):
        self.sc = input()
        self.rand = random.Random()

    def run(self):
        while True:
            W = int(input())
            H = int(input())
            if W == 0 and H == 0:
                break
            map = [input() for _ in range(H)]

            dp = [[0] * (W + 1) for _ in range(H + 1)]

            for h in range(H):
                for w in range(W):
                    if map[h][w].isdigit():
                        hprev = dp[h][w - 1] if w > 0 else 0
                        wprev = dp[h - 1][w] if h > 0 else 0
                        max = max(hprev, wprev)
                        dp[h][w] = max.bit_or(BigInteger(map[h][w] + ""))
                    else:
                        dp[h][w] = 0

            max = max(dp[h][w] for h in range(H) for w in range(W))
            print(max)

    def main(self):
        self.run()

if __name__ == "__main__":
    Main()
