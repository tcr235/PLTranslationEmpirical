import math

INF = (1e9 + 5)
def main():
    n = int(input())
    a = []
    b = []
    left = INF
    right = 0
    for _ in range(n):
        a.append(int(input()))
        b.append(int(input()))
        left = min(left, a[-1])
        right = max(right, b[-1])
    for i in range(n):
        if left == a[i] and right == b[i]:
            print(i + 1)
            return
    print(-1)

if __name__ == "__main__":
    main()