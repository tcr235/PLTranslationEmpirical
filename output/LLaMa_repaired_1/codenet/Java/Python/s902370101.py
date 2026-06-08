n = int(input())
array = []
max_val = 0
min_val = 10000

for _ in range(n):
    line = input().split()
    array.extend(map(int, line))
    max_val = max((max_val, array[-1])[array[-1] > max_val])
    min_val = min((min_val, array[-1])[(array[-1] < min_val)])

print(max_val - min_val)