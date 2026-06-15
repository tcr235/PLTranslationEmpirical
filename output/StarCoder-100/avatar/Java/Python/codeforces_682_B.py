import sys

n = int(input())

list = []

for i in range(n):
    list.append(int(input()))

list.sort()

c = 1

for i in range(n):
    if list[i] >= c:
        c += 1

print(c)

