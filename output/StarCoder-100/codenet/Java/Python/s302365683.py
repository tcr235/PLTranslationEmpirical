import sys

n = int(sys.stdin.readline())

arr = list(map(int, sys.stdin.readline().split()))

ans = 0

for i in range(n):
    if arr[i] > i:
        ans += arr[i] - i
    elif arr[i] < i:
        ans += arr[i]

print(ans)

