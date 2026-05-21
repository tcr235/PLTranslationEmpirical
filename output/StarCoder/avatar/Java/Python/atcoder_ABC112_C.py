MAX = 100

def check(n, x, y, h, cx, cy):
    ch = -1
    for i in range(n):
        if h[i] > 0:
            ch = abs(x[i] - cx) + abs(y[i] - cy) + h[i]
            break
    for i in range(n):
        if h[i] != max(ch - abs(x[i] - cx) - abs(y[i] - cy), 0):
            return -1
    return ch

def main():
    n = int(input())
    x = []
    y = []
    h = []
    for _ in range(n):
        x1, y1, h1 = map(int, input().split())
        x.append(x1)
        y.append(y1)
        h.append(h1)
    for i in range(MAX + 1):
        for j in range(MAX + 1):
            cheight = check(n, x, y, h, i, j)
            if cheight > 0:
                print(f"{i} {j} {cheight}")
                return

if __name__ == "__main__":
    main()