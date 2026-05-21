import sys

def calculate_result():
    nums = list(map(int, sys.stdin.readline().split()))
    n = nums[0]
    d = nums[1]
    nums = list(map(int, sys.stdin.readline().split())) + [0]
    result = 0
    for i in range(1, n):
        a = nums[i - 1] - nums[i]
        if a >= 0:
            result += (a // d) + 1
            nums[i] += ((a // d) + 1) * d
    print(result)

calculate_result()