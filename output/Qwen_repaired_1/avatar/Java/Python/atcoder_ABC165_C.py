import sys

sys.setrecursionlimit(1500)  # Increase recursion limit
from collections import deque

input = sys.stdin.readline
n, m, q = map(int, input().strip().split())
a = [int(input().strip()) - 1 for _ in range(q)]
b = [int(input().strip()) - 1 for _ in range(q)]
c = [int(input().strip()) for _ in range(q)]
d = [int(input().strip()) for _ in range(q)]

ans = -100

def dfs(path):
    if len(path) == n:
        score = sum(d[i] if path[b[i]] - path[a[i]] == c[i] else 0 for i in range(q))
        global ans
        ans = max(ans, score)
        return
    
    if not path or path[-1] != m + 1:
        for num in range(1, m + 1):  # Start from 1 instead of m+1
            dfs(path | {num})
    
    if path and path[-1] != list(path)[-2]:
        dfs(path[:-1])

path = deque([1])  # Start path with 1
dfs({*list(path)})  # Convert deque to set for union operation

print(ans)