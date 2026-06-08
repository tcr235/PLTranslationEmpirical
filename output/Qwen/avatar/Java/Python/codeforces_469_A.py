n = int(input())
levels = int(input())
sum_val = 0
sum2_val = 0
sum3_val = 0
arr = []
count = 0

for i in range(levels):
    arr.append(int(input()))

level2 = int(input())
level3 = levels + level2
arr2 = arr.copy()

for i in range(level2):
    arr2.append(int(input()))

for num in arr3:
    for value in arr2:
        if num == value:
            count += 1
            break

arr3 = list(range(1, n+1))

if count == n:
    print("I become the guy.")
else:
    print("Oh, my keyboard!")