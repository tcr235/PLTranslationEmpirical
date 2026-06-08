n = int(input())
levels = int(input())
arr2 = []

for _ in range(levels):
    arr2.append(int(input()))

level2 = int(input())

for _ in range(level2):
    arr2.append(int(input()))

arr3 = list(range(1, n+1))

count = 0

for num in arr3:
    if num in arr2:
        count += 1

if count == n:
    print("I become the guy.")
else:
    print("Oh, my keyboard!")