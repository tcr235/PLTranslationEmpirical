import sys

n = int(sys.stdin.readline())

minN = int(sys.stdin.readline())-1

for i in range(n-1):
    h = int(sys.stdin.readline())
    if minN == h:
        minN = h
    elif minN == h-1:
        minN = h-1
    elif minN < h-1:
        minN = h-1
    elif minN > h:
        print("No")
        return

print("Yes")

