def solve():
    len = int(input())
    a = list(map(int, input().split()))
    l, r = 0, 0
    flag = False
    isTrue = False
    
    for i in range(len):
        if a[i] != i + 1 and not flag:
            l = i + 1
            flag = True
            continue
        if a[i] != i + 1 and flag:
            r = i + 1
            if a[r-1] - a[r-2] > 0:
                isTrue = True
                break
                
    print("".join(str(i) for i in ([l, r] if not isTrue else [0, 0])))

if __name__ == "__main__":
    solve()