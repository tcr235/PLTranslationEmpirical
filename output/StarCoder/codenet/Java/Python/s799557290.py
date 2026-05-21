import sys

a, b = map(int, sys.stdin.readline().split())
ju = [False] * (100001)
pe = [0] * (100001)
wa = 0
ac = 0

for _ in range(b):
    n, res = map(str, sys.stdin.readline().split())
    
    if res == "WA" and not ju[int(n)-1]:
        pe[int(n)-1] += 1
    
    if res == "AC":
        ju[int(n)-1] = True

for i in range(a):
    if ju[i]:
        ac += 1
        wa += pe[i]

print(f"{ac} {wa}")