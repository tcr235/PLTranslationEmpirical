N, x, *sweet = map(int, input().split())
sweet.sort()

num = 0
while num < len(sweet) and x - sweet[num] >= 0:
    x = x - sweet[num]
    num += 1
if num == len(sweet) and x > 0:
    num -= 1

print(num)