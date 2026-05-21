n = int(input())
k = int(input())
arr = list(map(int, input().split()))
res = ""
o = e = 0

for num in arr:
    if num == 1:
        o += 1
    else:
        e += 1

for _ in range(k):
    l = int(input()) - 1
    r = int(input()) - 1
    length = r - l + 1
    if length % 2 != 0:
        res += "0\n"
    elif (length // 2) <= o and (length // 2) <= e:
        res += "1\n"
    else:
        res += "0\n"

print(res)