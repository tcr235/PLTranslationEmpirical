def dfs(node, parent):
    global count, seen
    seen[node] = True
    for child in graph[node]:
        if child != parent:
            count += 1
            if dfs(child, node) == cycle:
                return cycle
    return count

def main():
    n = int(input())
    m = int(input())
    graph = [[] for _ in range(m+1)]
    seen = [False] * (m+1)
    for i in range(m+1):
        graph[i] = [j for j in range(n) if j not in graph]
    for i in range(n):
        a, b = map(int, input().split())
        graph[a].append(b)
        graph[b].append(a)
    count = 0
    cycle = dfs(1, 0)
    if cycle == dfs(1, 0):
        count += 1
    print(count)

