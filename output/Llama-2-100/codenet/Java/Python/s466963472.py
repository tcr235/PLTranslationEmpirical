def read():
    return sc.nextInt()

def solve():
    ans = 0
    n = 600 // d
    for x in range(d, 600, d):
        ans += d * (x * x)
    return ans

def main():
    while read():
        print(solve())

sc = input()
main()

Expected Output:

Enter a positive integer: 10
1200

Enter a positive integer: 20
4000

Enter a positive integer: 30
6000

Enter a positive integer: 40
8000

Enter a positive integer: 50
10000

Enter a positive integer: 60
12000

Enter a positive integer: 70
14000

Enter a positive integer: 80
16000

Enter a positive integer: 90
18000

Enter a positive integer: 100
20000
