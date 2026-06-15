#Contest081

import sys

n = int(sys.stdin.readline())
arr = [int(x) for x in sys.stdin.readline().split()]

cnt = 0
flag = True

while flag:
    for i in range(n):
        if arr[i] % 2 != 0:
            flag = False
            break
        else:
            arr[i] = arr[i] // 2
    cnt += flag
    flag = False

print(cnt)

