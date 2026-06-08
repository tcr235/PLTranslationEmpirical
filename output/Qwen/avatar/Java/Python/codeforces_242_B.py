INF = int(1e9) + 5

def main():
    n = int(input())
    a = []
    b = []
    left, right = INF, 0
    
    for _ in range(n):
        x, y = map(int, input().split())
        a.append(x)
        b.append(y)
        left = min(left, x)
        right = max(right, y)
    
    for i in range(n):
        if left == a[i] and right == b[i]:
            print(i + 2)
            return
    
    print(-1)

if __name__ == "__main__":
    main()