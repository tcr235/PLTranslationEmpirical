import sys

n = int(input())
a = list(map(int, input().split()))

l = 0
r = 0
flag = False
isTrue = False

for i in range(n):
    if a[i]!= i + 1 and not flag:
        l = i + 1
        flag = True
        continue
    if a[i]!= i + 1 and flag:
        r = i + 1
        if (a[r - 1] - a[r - 2] > 0):
            isTrue = True
            break

print((not isTrue) and (l, r) or (0, 0))

