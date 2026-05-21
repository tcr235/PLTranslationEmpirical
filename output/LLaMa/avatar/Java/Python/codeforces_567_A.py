import sys

a = int(input())
ar = [int(x) for x in input().split()] + [0]
max_val = 0
min_val = sys.maxsize

for i in range(len(ar)-1):
    max_val = max(max_val, ar[i+1] - ar[i], ar[-1] - ar[i])
    if i == 0:
        min_val = ar[i+1] - ar[i]
    elif i == len(ar)-2:
        min_val = ar[i] - ar[i-1]
    else:
        min_val = min(ar[i] - ar[i-1], ar[i+1] - ar[i])
    print(min_val, max_val)