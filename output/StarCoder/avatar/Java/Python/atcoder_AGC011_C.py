import sys

class Graph:
    def __init__(self, n):
        self.n = n
        self.graph = [[] for _ in range(n)]
        self.visited = [False] * n
        self.color = [-1] * n
        self.one = 0
        self.bipartite = 0
        self.count = 0

    def add_edge(self, u, v):
        self.graph[u].append(v)
        self.graph[v].append(u)

    def dfs(self, a, c):
        if self.visited[a]:
            if self.color[a] >= 0 and self.color[a] != c:
                self.mujun = True
            return 0
        self.visited[a] = True
        self.color[a] = c
        total = 1
        for b in self.graph[a]:
            total += self.dfs(b, 1 - c)
        return total

def main():
    input = sys.stdin.read
    data = input().split()
    
    index = 0
    n = int(data[index])
    index += 1
    m = int(data[index])
    index += 1
    
    g = Graph(n)
    for _ in range(m):
        u = int(data[index]) - 1
        index += 1
        v = int(data[index]) - 1
        index += 1
        g.add_edge(u, v)
    
    total = g.one * (2 * g.n - g.one) + (g.count - g.one) * (g.count - g.one) + g.bipartite * g.bipartite
    print(total)

if __name__ == "__main__":
    sys.setrecursionlimit(10**6)
    main()