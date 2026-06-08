import math

def C(n, m):
    num = 1
    for i in range(m - n + 1, m + 1):
        num *= i
    for i in range(2, n + 2):
        num //= i
    return num

def main():
    n, p = map(int, input().split())
    k0, k1 = 0, 0
    for _ in range(n):
        nums = list(map(int, input().split()))
        for x in nums:
            if x % 2 == 1:
                k1 += 1
            else:
                k0 += 1

    ans = 1
    for _ in range(k0):
        ans *= 2

    if p == 0:
        add = 0
        for i in range(0, k1 + 1, 2):
            add += C(i, k1)
        ans *= add
    else:
        add = 0
        for i in range(1, k1 + 1, 2):
            add += C(i, k1)
        ans *= add

    print(ans)

if __name__ == "__main__":
    main()