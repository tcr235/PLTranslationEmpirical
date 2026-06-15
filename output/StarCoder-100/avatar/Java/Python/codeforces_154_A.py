import sys

n = int(raw_input().strip())
s = raw_input().strip()
k = int(raw_input().strip())

a = 0
b = 0

for i in range(n):
    if s[i] == 'A':
        a += 1
    elif s[i] == 'B':
        b += 1
    else:
        print min(a, b)
        a = b = 0

print min(a, b)

