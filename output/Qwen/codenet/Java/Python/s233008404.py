import sys

input = sys.stdin.readline

class Main:
    def __init__(self):
        self.colorMtr = []
        self.h = 0
        self.w = 0
        self.k = 0

    def solve(self):
        h, w, k = map(int, input().split())
        self.h, self.w, self.k = h, w, k
        
        for _ in range(h):
            row = list(input().strip())
            self.colorMtr.append(row)
        
        h_pattern = 1 << h
        w_pattern = 1 << w
        
        ans = 0
        
        for i in range(h_pattern):
            for j in range(w_pattern):
                if self.judge(i, j):
                    ans += 1
        
        print(ans)

    def judge(self, h_pattern, w_pattern):
        h_bit_arr = [(h_pattern >> i) & 1 for i in range(self.h)]
        w_bit_arr = [(w_pattern >> i) & 1 for i in range(self.w)]
        
        black = sum(1 for i in range(self.h) for j in range(self.w) if not h_bit_arr[i] and not w_bit_arr[j] and self.colorMtr[i][j] == '#')
        
        return black == self.k

if __name__ == '__main__':
    mainObj = Main()
    mainObj.solve()