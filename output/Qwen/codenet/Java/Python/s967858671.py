num = [0] * 11
for i in range(10):
    num[i] = int(input())
    
for a in range(9, -1, -1):
    for b in range(a):
        if num[b] > num[b + 1]:
            num[b], num[b + 1] = num[b + 1], num[b]

print(num[0])
print(num[1])
print(num[2])