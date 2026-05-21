n = int(input())
array = []
max_val = 0
min_val = 10000

for _ in range(n):
    array.append(int(input()))
    if max_val < array[-1]:
        max_val = array[-1]
    if min_val > array[-1]:
        min_val = array[-1]

print(max_val - min_val)