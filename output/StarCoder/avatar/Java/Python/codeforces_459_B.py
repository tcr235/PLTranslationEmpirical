import sys

input = sys.stdin.read
data = input().split()

N = int(data[0])
A = list(map(int, data[1:]))

A.sort()
min_value = A[0]
max_value = A[N - 1]

mins = A.count(min_value)
maxs = A.count(max_value)

if min_value == max_value:
    print((max_value - min_value), (mins * (mins - 1)) // 2)
else:
    print((max_value - min_value), mins * maxs)