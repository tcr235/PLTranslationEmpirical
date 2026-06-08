def min(arr: list, n: int) -> int:
    if n == 1:
        return 0
    elif n == 2:
        return abs(arr[n-1] - arr[n-2])
    else:
        op1 = abs(arr[n-1] - arr[n-2]) + min(arr, n-1)
        op2 = abs(arr[n-1] - arr[n-3]) + min(arr, n-2)
        return min(op1, op2)

def dpc(arr: list, i: int, n: int, row: int) -> int:
    if row == n:
        return 0
    else:
        if i == 1:
            j, k = 0, 2
        elif i == 0:
            j, k = 1, 2
        else:
            j, k = 0, 1
        return arr[row][i] + max(dpc(arr, j, n, row+1), dpc(arr, k, n, row+1))

def dpx(arr: list, n: int) -> int:
    dp = [[0 for _ in range(3)] for _ in range(n)]
    dp[0][0], dp[0][1], dp[0][2] = arr[0][0], arr[0][1], arr[0][2]
    for i in range(1, n):
        for in_ in range(3):
            if in_ == 1:
                j, k = 0, 2
            elif in_ == 0:
                j, k = 1, 2
            else:
                j, k = 0, 1
            dp[i][in_] = max(dp[i-1][k], dp[i-1][j]) + arr[i][in_]
    return max(dp[n-1][0], max(dp[n-1][1], dp[n-1][2]))

def main():
    import sys
    arr_str = ' '.join(sys.stdin.readline().strip().split())
    n = int(arr_str.split()[0])
    arr = [list(map(int, x.split())) for x in arr_str.split()[1:]]
    ans = dpx(arr, n)
    print(ans)

if __name__ == "__main__":
    main()