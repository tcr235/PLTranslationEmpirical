import sys

n = int(sys.stdin.readline())
a = [int(sys.stdin.readline()) for _ in range(n)]

count = 0
bef = 0
for i in range(1, n):
    if a[i-1] < a[i]:
        count += 1
        bef = 1
    elif a[i-1] > a[i]:
        count += 1
        bef = -1
    else:
        continue
    if bef == 0:
        bef = a[i]
    elif bef != a[i]:
        count += 1
        bef = 0

print(count)

