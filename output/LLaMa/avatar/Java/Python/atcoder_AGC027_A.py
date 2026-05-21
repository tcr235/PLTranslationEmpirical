import sys

N = int(input())
x = int(input())
sweet = []
for _ in range(N):
    a = int(input())
    sweet.append(a)
sweet.sort()

num = 0
while num < N and x - sweet[num] >= 0:
    x = x - sweet[num]
    num += 1
if num == N and x > 0:
    num -= 1

print(num)