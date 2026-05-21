import re

num = [i + 1 for i in range(int(input()))]
count = int(input())
pattern = re.compile(r"(\d+),(\d+)")
line = []

for _ in range(count):
    temp = input()
    matcher = pattern.match(temp)
    line.extend((int(x) - 1 for x in matcher.groups()))

for i in range(count):
    temp = input()
    matcher = pattern.match(temp)
    line[i] = int(matcher.group(i + 1)) - 1

for i in range(len(num)):
    num[line[0]], num[line[1]] = num[line[1]], num[line[0]]

print(*num)