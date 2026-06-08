from collections import OrderedDict

def main():
    sc = input().split()
    a = list(map(int, sc))
    r = [x % 10 for x in a]
    map = OrderedDict()
    
    for i in range(len(a)):
        b = 10 if r[i] == 0 else 10 - r[i]
        map[b] = a[i]
    
    ans = 0
    
    if not map:
        for i in range(len(a)):
            ans += a[i]
        print(ans)
        return
    
    last = next(reversed(map.values()))
    idx = a.index(last)
    
    for i in range(len(a)):
        if i != idx:
            if r[i] == 0:
                ans += a[i]
            else:
                ans += a[i] + (10 - r[i])
    
    ans += last
    print(ans)

main()