import sys

n = int(sys.stdin.readline())
arr = [sys.stdin.readline() for _ in range(n)]

arr.sort()

a = arr[0]
cnt = 0

for i in range(n):
    if a == arr[i]:
        pass
    else:
        cnt += 1
        a = arr[i]

print(cnt)
