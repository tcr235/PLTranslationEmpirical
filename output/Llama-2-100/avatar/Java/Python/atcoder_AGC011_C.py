import collections
class Main:
    def __init__(self):
        self.graph = collections.defaultdict(list)
        self.visited = [False] * (len(self.graph))
        self.color = [-1] * (len(self.graph))
        self.one = 0
        self.bipartite = 0
        self.count = 0
        self.mujun = False
    
    def dfs(self, u, c):
        if self.visited[u]:
            if self.color[u] >= 0 and self.color[u] != c:
                self.mujun = True
                return 0
            return 1
        self.visited[u] = True
        self.color[u] = c
        total = 1
        for v in self.graph[u]:
            total += self.dfs(v, 1 - c)
        return total
    
    def run(self):
        n = int(input())
        m = int(input())
        for i in range(n):
            self.graph[i] = [j for j in range(m) if j != i]
        for i in range(n):
            if self.visited[i]:
                continue
            self.count += 1
            self.mujun = False
            kind = self.dfs(i, 0)
            if kind == 1:
                self.one += 1
            else:
                self.bipartite += 1
        total = self.one * (2 * n - self.one) + (self.count - self.one) * (self.count - self.one) + self.bipartite * self.bipartite
        print(total)

