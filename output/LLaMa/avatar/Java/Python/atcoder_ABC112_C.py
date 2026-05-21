import sys

MAX = 100

def main():
    try:
        n = int(input())
        x = [0]*n
        y = [0]*n
        h = [0]*n

        for i in range(n):
            x[i], y[i], h[i] = map(int, input().split())

        for i in range(MAX + 1):
            for j in range(MAX + 1):
                ch = check(n, x, y, h, i, j)
                if ch > 0:
                    print(f"{i} {j} {ch}")

def check(n, x, y, h, cx, cy):
    ch = -1
    for i in range(n):
        if h[i] > 0:
            ch = abs(x[i] - cx) + abs(y[i] - cy) + h[i]
            break
    for i in range(n):
        if h[i] != max(0, ch - abs(x[i] - cx) - abs(y[i] - cy)):
            return -1
    return ch

if __name__ == "__main__":
    main()