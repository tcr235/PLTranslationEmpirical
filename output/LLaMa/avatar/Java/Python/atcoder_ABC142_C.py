from collections import defaultdict
import sys

P = []
N = int(input())

idorder = defaultdict(lambda: 0)
for i in range(1, N+1):
    A = int(input())
    idorder[A] = i

for i in range(1, N+1):
    print(idorder[i], end=" ")