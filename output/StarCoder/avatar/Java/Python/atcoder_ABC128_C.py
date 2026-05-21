import sys

def main():
    input = sys.stdin.read
    data = list(map(int, input().split()))
    
    N = data[0]
    M = data[1]
    
    a = [0] * N
    
    index = 2
    for _ in range(M):
        k = data[index]
        for _ in range(k):
            s = data[index + _ + 1]
            s -= 1
            a[s] |= (1 << (_))
        index += k + 1
    
    p = 0
    for _ in range(M):
        x = data[index]
        p |= (x << (_))
        index += 1
    
    ans = 0
    for s in range(1 << N):
        t = 0
        for i in range(N):
            if (s >> i) & 1:
                t ^= a[i]
        if p == t:
            ans += 1
    
    print(ans)

if __name__ == "__main__":
    main()