from collections import deque

n, m, q = map(int, input().split())
a = [int(input()) - 1 for _ in range(q)]
b = [int(input()) - 1 for _ in range(q)]
c = [int(input()) for _ in range(q)]
d = [int(input()) for _ in range(q)]

def dfs(path):
    if len(path) == n:
        score = sum(d[i] if path[b[i]] - path[a[i]] == c[i] else 0 for i in range(q))
        global ans
        ans = max(ans, score)
        return
    
    if not path or path[-1] != m + 1:
        for num in range(m + 1):
            dfs(path | {num})
    
    if path and path[-1] != list(path)[-2]:
        dfs(path[:-1])

path = deque([m + 1])
dfs(path)

print(ans)