n = int(input())
count = 0
flag = 0

while n > 0:
    numbers = input().split()
    x = int(numbers[0])
    y = int(numbers[1])
    
    if x == y:
        count += 1
        if count >= 3:
            flag = 1
    else:
        count = 0
        
    n -= 1

if flag == 0:
    print("No")
else:
    print("Yes")