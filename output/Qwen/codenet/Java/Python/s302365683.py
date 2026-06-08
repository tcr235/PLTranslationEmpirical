from collections import defaultdict

def main():
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    hm = defaultdict(int)
    
    for i in range(n):
        val = int(data[i + 1])
        hm[val] += 1
    
    ans = 0
    for val, num in hm.items():
        if num > val:
            ans += (num - val)
        elif num < val:
            ans += num
    
    print(ans)

if __name__ == "__main__":
    main()