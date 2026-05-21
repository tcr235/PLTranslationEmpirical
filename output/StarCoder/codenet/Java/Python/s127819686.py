import sys
input = sys.stdin.read
data = input().split()
a = int(data[0])
b = int(data[1])

hb = b // 2

print(a + hb)