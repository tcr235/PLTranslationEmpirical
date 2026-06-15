import input

class Main:
    high = 0
    low = 0
    sa = 0
    
    def solve():
        sc = input. Scanner(sys.stdin)
        for i in range(7):
            high = sc.nextInt()
            low = sc.nextInt()
            sa = high - low
            print(sa)

if __name__ == "__main__":
    obj = Main()
    obj.solve()
