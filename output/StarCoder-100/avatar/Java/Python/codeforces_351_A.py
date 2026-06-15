import sys

n = int(raw_input())

arr = [float(x) for x in raw_input().split()]

non_int = 0
sum_before = 0
sum = 0

for i in range(len(arr)):
    num = arr[i]
    sum_before += num
    if num!= int(num):
        non_int += 1
    sum += int(num)

max_sum = min(n, non_int) + sum
min_sum = max(0, non_int - n) + sum

if min_sum > sum_before:
    ans = min_sum - sum_before
elif max_sum < sum_before:
    ans = sum_before - max_sum
else:
    x = sum_before - int(sum_before)
    ans = min(1 - x, x)

print "%.3f" % ans

