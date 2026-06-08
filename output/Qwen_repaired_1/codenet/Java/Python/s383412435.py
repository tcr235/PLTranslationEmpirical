def main():
    sc = input().split()
    N = int(sc[0])
    a = list(map(int, sc[1:]))
    a.sort()
    ans = 0
    j = 0
    while j < N:
        count = 1
        i = j + 1
        while i < N and a[i] == a[j]:
            count += 1
            i += 1
        
        if count > a[j]:
            ans += count - a[j]
        elif count < a[j]:
            ans += count
        
        j += count
    
    print(ans)

if __name__ == "__main__":
    main()