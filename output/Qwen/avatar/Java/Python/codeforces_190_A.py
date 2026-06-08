def solve_codeforces(n, m):
    if n == 0:
        if m != 0:
            print("Impossible")
        else:
            print("0 0")
        return
    if m <= n:
        if m == 0:
            m = 1
        print(f"{n} {m + n - 1}")
    else:
        print(f"{m} {m + n - 1}")

if __name__ == "__main__":
    import sys
    input = sys.stdin.read
    data = input().split()
    n = int(data[0])
    m = int(data[1])
    solve_codeforces(n, m)