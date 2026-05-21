import sys

def fun(arr, q, n):
    res = -1
    i, j = 0, n - 1
    while i <= j:
        md = (i + j) // 2
        if arr[md] == q:
            return md
        elif arr[md] > q:
            res = md
            j = md - 1
        else:
            i = md + 1
    return res

def main():
    n = int(input())
    arr = [0] * n
    arr[0] = int(input())
    for i in range(1, n):
        arr[i] = int(input()) + arr[i - 1]
    m = int(input())
    q = []
    for _ in range(m):
        q.append(int(input()))
    for k in range(m):
        print(fun(arr, q[k], n) + 1)

if __name__ == "__main__":
    main()