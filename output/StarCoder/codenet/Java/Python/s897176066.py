N = int(input())
A = sorted(list(map(int, input().split())))
for j in range(1, N):
  if A[j] == A[j - 1]:
    print("NO")
    exit(0)
print("YES")