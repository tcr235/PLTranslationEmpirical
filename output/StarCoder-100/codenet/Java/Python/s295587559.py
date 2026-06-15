import re

n = int(input())
num = [i for i in range(1, n + 1)]

count = int(input())
for i in range(count):
    line = input().split(',')
    num[int(line[0]) - 1], num[int(line[1]) - 1] = num[int(line[1]) - 1], num[int(line[0]) - 1]

for i in num:
    print(i)
