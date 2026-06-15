import sys

sys.stdin.readline().split()

a = int(sys.stdin.readline().strip())

b = int(sys.stdin.readline().strip())

c = a - b * 2

if c < 0:

c = 0

print(c)
