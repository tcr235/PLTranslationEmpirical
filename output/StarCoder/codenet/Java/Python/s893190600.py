class Main:
    def main(self):
        import sys
        input = sys.stdin.read
        data = input().split()
        
        self.Solver(data)

    def Solver(self, data):
        H = int(data.pop(0))
        W = int(data.pop(0))
        C = [['.' for _ in range(W + 2)] for _ in range(H + 2)]
        
        for i in range(1, H + 1):
            row = list(data.pop(0).strip())
            for j in range(1, W + 1):
                C[i][j] = row[j - 1]
                
        if H == 1 and W == 1:
            print("No")
            return
        
        valid = True
        for i in range(1, H + 1):
            for j in range(1, W + 1):
                if C[i][j] == '#' and all(C[x][y] != '#' for x, y in [(i - 1, j), (i + 1, j), (i, j - 1), (i, j + 1)]):
                    print("No")
                    valid = False
                    return
                    
        if valid:
            print("Yes")

if __name__ == "__main__":
    main = Main()
    main.main()