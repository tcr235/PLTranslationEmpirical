n = int(input().split()[0])
k = int(input().split()[1])
i = 1
req = 1

while k - req >= 0:
    k -= req
    i += 1
    if i % n != 0:
        req = i % n
    else:
        req = n

print(k)