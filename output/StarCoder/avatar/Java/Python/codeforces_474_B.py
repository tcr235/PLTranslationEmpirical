import sys

def fun(arr, q):
    res = 0
    i, j = 0, len(arr)
    while i <= j:
        md = i + (j - i) // 2
        if arr[md] == q:
            return md
        elif arr[md] > q:
            res = md
            j = md - 1
        else:
            i = md + 1
    return res

def main():
    input = sys.stdin.read
    data = input().split()
    n = int(data[0])
    arr = [int(data[1])]
    for i in range(1, n):
        x = int(data[i + 1])
        arr.append(x + arr[-1])
    
    m = int(data[n + 2])
    q = [int(data[n + 3 + i]) for i in range(m)]
    
    for k in range(m):
        print(fun(arr, q[k]) + 1)

if __name__ == "__main__":
    main()