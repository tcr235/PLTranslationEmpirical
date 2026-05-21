import sys

input = sys.stdin.read
data = input().split()

n = int(data[0])
ara = list(map(int, data[1:]))

map_dict = {}
for i in range(n):
    v = ara[i]
    if v not in map_dict:
        map_dict[v] = 1
    else:
        map_dict[v] += 1

max_count = max(map_dict.values())

mm_dict = {}
for i in range(n):
    v = ara[i]
    if v not in mm_dict:
        mm_dict[v] = 1
        if mm_dict[v] == max_count:
            print(v)
            break
    else:
        mm_dict[v] += 1
        if mm_dict[v] == max_count:
            print(v)
            break