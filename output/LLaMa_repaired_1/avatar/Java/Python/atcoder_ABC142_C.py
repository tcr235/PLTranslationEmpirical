from collections import defaultdict

P = []
N = int(input())
idorder = defaultdict(bool)

for _ in range(N):
    A = input().split()
    A = int(A[0])
    idorder[A] = True

for i in range(1, N+1):
    print(idorder[i], end=" ")