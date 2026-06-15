import sys

n = int(raw_input().strip())
arr = map(int, raw_input().strip().split(' '))

max_num = max(arr)
min_num = min(arr)

print max_num - min_num

