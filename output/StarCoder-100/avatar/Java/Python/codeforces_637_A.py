import sys

n = int(raw_input())

arr = map(int,raw_input().split())

max_count = 0

for i in arr:
    if arr.count(i) > max_count:
        max_count = arr.count(i)
        max_num = i

print max_num

