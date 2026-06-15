import sys
input = sys.stdin.read()
m = int(input.split()[0])
n = int(input.split()[1])
manju = [int(x) for x in input.split()[2:]]
boxlen = [int(x) for x in input.split()[n:]]
boxcost = [int(x) for x in input.split()[n+1:]]

def sort(a):
    for i in range(len(a)-1, -1, -1):
        j = random.randint(0, len(a)-i-1)
        a[i], a[j] = a[j], a[i]
    return a.sort()

def input_reader():
    while True:
        try:
            return int(input.readline().strip())
        except EOFError:
            break

def next_int():
    return int(input.readline().strip())

def next_long():
    return long(input.readline().strip())

def to_int_array(n):
    a = [int(x) for x in input.readline().strip().split()]
    return a

def dp(m, n):
    dp = [[0] * (n+1) for _ in range(m+1)]
    for i in range(m+1):
        for j in range(n+1):
            if i == 0 or j == 0:
                dp[i][j] = 0
            else:
                dp[i][j] = max(dp[i-1][j], dp[i][j-1]) + manju[m-1] - boxcost[j-1]
    return dp

m = input_reader()
n = input_reader()
manju = [int(x) for x in input.split()[2:]]
boxlen = [int(x) for x in input.split()[n:]]
boxcost = [int(x) for x in input.split()[n+1:]]
dp = dp(m, n)
print(dp[0][0])
