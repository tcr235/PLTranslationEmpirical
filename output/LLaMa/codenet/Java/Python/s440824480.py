import sys

n = int(input())
count = 0
flag = 0

while n > 0:
    x = int(input())
    y = int(input())
    
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