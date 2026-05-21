from collections import deque

class codeforces_216_B:
    def __init__(self):
        self.count = 0
        self.seen = [False] * (m + 1)
        self.graph = [[] for _ in range(m + 1)]

    def dfs(self, child, par):
        if self.seen[child]:
            return self.cycle
        self.seen[child] = True
        for i in self.graph[child]:
            if i != par:
                self.count += 1
                if self.dfs(i, child) == self.cycle:
                    return self.cycle
        return self.path

def main():
    m, n = map(int, input().split())
    ft = codeforces_216_B()
    for i in range(m + 1):
        ft.graph[i] = []
    for _ in range(n):
        x, y = map(int, input().split())
        ft.graph[x].append(y)
        ft.graph[y].append(x)
    toremove = 0
    for i in range(1, m + 1):
        if not ft.seen[i]:
            ft.count = 0
            ft.path = i
            ft.cycle = i
            if ft.dfs(i, 0) == ft.cycle:
                if ft.count % 2 == 1:
                    toremove += 1
    if (m - toremove) % 2 == 1:
        toremove += 1
    print(toremove)

main()