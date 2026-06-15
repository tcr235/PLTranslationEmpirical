import sys

N = int(sys.stdin.readline())
A = [long(sys.stdin.readline()) for _ in range(N)]

A.sort()

for j in range(1, N):
    if A[j] == A[j-1]:
        print("NO")
        sys.exit(0)

print("YES")
