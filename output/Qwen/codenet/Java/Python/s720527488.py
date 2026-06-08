from sys import stdin, stdout

input = stdin.read
data = input().split()

def next_int():
    global data
    result = int(data[0])
    data = data[1:]
    return result

def next_long():
    global data
    result = int(data[0])
    data = data[1:]
    return result

def next_string():
    global data
    result = data[0]
    data = data[1:]
    return result

randomize_array = lambda arr: (arr.sort(key=lambda _: random.randint(0, 1)), arr)

INF = float('inf') // 2
LINF = float('inf') // 2

def solve():
    m = next_int()
    n = next_int()
    manju = list(reversed([next_int() for _ in range(m)]))
    boxlen = [next_int() for _ in range(n)]
    boxcost = [next_int() for _ in range(n)]
    
    randomize_array(boxlen)
    randomize_array(boxcost)
    randomize_array(manju)
    
    dp = [[0] * (n + 1) for _ in range(m + 1)]
    
    for i in range(m - 1, -1, -1):
        for j in range(n - 1, -1, -1):
            length = min(i + boxlen[j], m)
            count = sum(manju[length - k - 1] for k in range(m - length))
            dp[i][j] = max(dp[i][j], dp[length][j + 1] + count - boxcost[j])
            dp[i][j] = max(dp[i][j], dp[i][j + 1])

    stdout.write(str(dp[0][0]))

solve()