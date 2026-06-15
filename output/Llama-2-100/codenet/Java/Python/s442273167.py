import sys

n = int(sys.stdin.readline())
l = [int(sys.stdin.readline()) for _ in range(n)]
r = [int(sys.stdin.readline()) for _ in range(n)]

sum = 0
for i in range(n):
    sum += r[i] - l[i] + 1

print(sum)
