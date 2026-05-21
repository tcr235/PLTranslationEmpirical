from collections import OrderedDict

def atcoder_ABC123_B():
    a = list(map(int, input().split()))
    r = [i % 10 for i in a]
    map_ = OrderedDict()
    for i in range(len(a)):
        if r[i] != 0:
            map_[10 - r[i]] = a[i]
    
    ans = 0
    if not map_:
        for i in a:
            ans += i
        print(ans)
        return
    
    last = list(map_.values())[-1]
    idx = 0
    for i in range(len(a)):
        if a[i] == last:
            idx = i
    
    for i in range(len(a)):
        if i != idx:
            if a[i] % 10 == 0:
                ans += a[i]
            else:
                ans += a[i] + (10 - r[i])
    
    ans += last
    print(ans)

atcoder_ABC123_B()