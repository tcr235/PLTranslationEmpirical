import sys
from threading import Thread
from collections import defaultdict

class Main(Thread):
    def __init__(self):
        super().__init__()
        self.graph = defaultdict(list)
        self.visited = [False] * 0
        self.color = [-1] * 0
        self.one = 0
        self.bipartite = 0
        self.count = 0
        self.mujun = False

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

    def run(self):
        n = int(input())
        m = int(input())
        self.visited = [False] * n
        self.color = [-1] * n
        self.graph = [defaultdict(list) for _ in range(n)]
        for _ in range(m):
            u = int(input()) - 1
            v = int(input()) - 1
            self.graph[u][v].append(v)
            self.graph[v][u].append(u)

        for i in range(n):
            if self.visited[i]:
                continue
            self.count += 1
            self.mujun = False
            kind = self.dfs(i, 0)
            if kind == 1:
                self.one += 1
            elif not self.mujun:
                self.bipartite += 1

        total = self.one * (2 * n - self.one)
        total += (self.count - self.one) * (self.count - self.one)
        total += self.bipartite * self.bipartite
        print(total)

def main():
    thread = Main()
    thread.start()

if __name__ == "__main__":
    main()