import sys

class Main:
    def run(self):
        while True:
            W, H = list(map(int, sys.stdin.readline().strip().split()))
            if W == 0 and H == 0:
                return
            map = [sys.stdin.readline().strip() for _ in range(H)]
            
            dp = [[0] * W for _ in range(H)]
            
            for h in range(H):
                for w in range(W):
                    hprev = dp[h-1][w] if h >= 1 else 0
                    wprev = dp[h][w-1] if w >= 1 else 0
                    
                    if map[h][w].isdigit():
                        dp[h][w] = (max(hprev, wprev) * 10) + int(map[h][w])
                    else:
                        dp[h][w] = 0
                        
            print(max([x for row in dp for x in row]))

def pr(o):
    sys.stdout.write(str(o))
    
def ln(o=''):
    sys.stdout.write(o + '\n')

def ln_():
    sys.stdout.write('\n')

if __name__ == "__main__":
    Main().run()