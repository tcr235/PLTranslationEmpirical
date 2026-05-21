import sys

N = int(input())
A = list(map(int, input().split()))
A.sort()

for j in range(1, N):
    if A[j] == A[j-1]:
        sys.stdout.write("NO\n")
        sys.exit(0)

print("YES")