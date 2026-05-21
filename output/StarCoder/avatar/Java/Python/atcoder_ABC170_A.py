import sys

input_array = sys.stdin.readline().strip().split()
result = 0

for str in input_array:
    result += 1
    if str == "0":
        break

print(result)