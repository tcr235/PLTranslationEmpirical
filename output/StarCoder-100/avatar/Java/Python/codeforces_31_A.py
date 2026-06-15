import sys

n = int(raw_input())
a = map(int, raw_input().split())

for k in range(n):
    t = a[k]
    for i in range(n):
        for j in range(n-1):
            if i!= j and t == (a[i] + a[j]):
                print k+1, j+1, i+1
                sys.exit(0)

print -1

