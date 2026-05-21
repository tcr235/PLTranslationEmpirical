from typing import List
import sys
import random

def input_reader():
    return sys.stdin.readline

def sort(a: List[int]):
    for i in range(len(a)-1, 0, -1):
        j = random.randint(0, i)
        a[i], a[j] = a[j], a[i]
    a.sort()

def solve(m: int, n: int, manju: List[int], boxlen: List[int], boxcost: List[int]) -> None:
    dp = [[0] * (n+1) for _ in range(m+1)]

    for i in range(m-1, -1, -1):
        for j in range(n-1, -1, -1):
            len_box = min(i + boxlen[j], m)
            cnt = sum(manju[m-1-k] for k in range(i, len_box))
            dp[i][j] = max(dp[i][j], dp[len_box][j+1] + cnt - boxcost[j])
            dp[i][j] = max(dp[i][j], dp[i][j+1])

    print(dp[0][0])

def main() -> None:
    input_func = input_reader()
    m = int(input_func())
    n = int(input_func())
    manju = [int(x) for x in input_func().split()]
    sort(manju)
    boxlen = [int(x) for x in input_func().split() for _ in range(n)]
    boxcost = [int(x) for x in input_func().split() for _ in range(n)]
    solve(m, n, manju, boxlen, boxcost)

if __name__ == "__main__":
    main()