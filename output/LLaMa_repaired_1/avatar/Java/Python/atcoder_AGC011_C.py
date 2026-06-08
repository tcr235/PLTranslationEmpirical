import sys
from collections import defaultdict, deque

class Main:
    def __init__(self):
        self.graph = defaultdict(list)
        self.visited = [False] * 0
        self.color = [-1] * 0
        self.one = 0
        self.bipartite = 0
        self.count = 0
        self.mujun = False

    def dfs(self, a, c,inally_mut):
        if self.visited[a]:
            if self.color[a] >= 0 and self.color[a] != c:
                self.mujun = True
                return False
            return True
        self.visited[a] = True
        self.color[a] = c
        has_other = False
        for b in self.graph[a]:
            has_other |= self.dfs(b, 1 - c, False)
        return inally_mut or has_other

    def run(self):
        n = int(input().split()[0])
        self.visited = [False] * n
        self.color = [-1] * n
        self.graph = [defaultdict(list) for _ in range(n)]
        for _ in range(int(input().split()[0])):
            u, v = map(lambda x: int(x) - 1, input().split())
            self.graph[u][v].append(v)
            self.graph[v][u].append(u)
        for i in range(n):
            if self.visited[i]:
                continue
            self.count += 1
            self.mujun = False
            inally_mut = False
            for c in [0, 1]:
                if self.dfs(i, c, True):
                    self.mujun = False
                    inally_mut = True
                    break
            if inally_mut:
                self.one += 1
            elif not self.mujun:
                self.bipartite += 1
        total = self.one * (2 * n - self.one)
        total += (self.count - self.one) * (self.count - self.one)
        total += self.bipartite * self.bipartite
        print(total)

if __name__ == "__main__":
    Main().run()