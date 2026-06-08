import sys

def read_input():
    return sys.stdin.read()

data = read_input().strip()
lines = data.split('\n')

n = int(lines[0])
numbers = list(map(float, lines[1].split()))

non_int = 0
sum_before = 0.0
sum_floor = 0.0

for num in numbers:
    sum_before += num
    if num != int(num):
        non_int += 1
    sum_floor += int(num)

max_sum = min(n, non_int) + sum_floor
min_sum = max(0, non_int - n) + sum_floor

x = sum_before - int(sum_before)

if min_sum > sum_before:
    ans = min_sum - sum_before
elif max_sum < sum_before:
    ans = sum_before - max_sum
else:
    ans = min(1 - x, x)

print(f"{ans:.3f}")