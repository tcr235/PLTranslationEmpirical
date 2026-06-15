import sys

n=int(sys.stdin.readline())
m=int(sys.stdin.readline())

po=[]
for i in range(n):
    po.append(int(sys.stdin.readline()))
    m-=po[i]

print(n+m/po[0])
