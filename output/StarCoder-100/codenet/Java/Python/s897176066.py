import sys

n = int(raw_input().strip())
a = map(int, raw_input().strip().split(' '))
a.sort()

for i in range(1, n):
    if a[i] == a[i-1]:
        print "NO"
        sys.exit(0)

print "YES"

