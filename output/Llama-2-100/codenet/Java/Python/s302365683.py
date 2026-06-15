def main():

    n = int(input())
    hm = {}
    for i in range(n):
        val = int(input())
        hm[val] = hm.get(val, 0) + 1
    ans = 0
    for key in hm.keys():
        num = hm[key]
        if num > key:
            ans += num - key
        elif num < key:
            ans += num
    print(ans)


