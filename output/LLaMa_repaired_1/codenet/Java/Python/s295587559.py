import re

num = [i + 1 for i in range(int(input()))]
count = int(input())
pattern = re.compile(r"(\d+),(\d+)")
line = [temp.split(',') for temp in [input()]*count]

for i in range(len(line)):
    line[i] = [int(y) - 1 for y in line[i]]

for i in range(count):
    temp = input()
    matcher = pattern.match(temp)
    line[i] = [int(x) - 1 for x in matcher.groups()]

for i in range(len(num)):
    num[line[0][0]], num[line[1][0]] = num[line[1][0]], num[line[0][0]]

print(*num)