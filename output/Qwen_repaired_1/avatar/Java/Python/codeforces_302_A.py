n, k = map(int, input().split())
arr = list(map(int, input().split()))
res = ""
o = e = 0

for num in arr:
    if num == 1:
        o += 1
    else:
        e += 1

for _ in range(k):
    l, r = map(int, input().split())
    length = r - l + 1
    if length % 2 != 0:
        res += "0\n"
    elif (length // 2) <= o and (length // 2) <= e:
        res += "1\n"
    else:
        res += "0\n"

print(res)