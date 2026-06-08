from collections import defaultdict
import sys

sys.setrecursionlimit(200000)

class FastScanner:
    def __init__(self):
        self._input = iter(sys.stdin.read().split())

    def next(self):
        return next(self._input)

def dfs(v, par, val):
    global counter, graph
    for i in graph[v]:
        if i != par:
            dfs(i, v, val + counter[v])
    counter[v] += val

def main():
    global counter, graph
    scanner = FastScanner()
    n = int(scanner.next())
    q = int(scanner.next())
    graph = defaultdict(list)
    for _ in range(n - 1):
        a = int(scanner.next()) - 1
        b = int(scanner.next()) - 1
        graph[a].append(b)
        graph[b].append(a)
    
    counter = [0] * n
    for _ in range(q):
        node = int(scanner.next()) - 1
        value = int(scanner.next())
        counter[node] += value
    
    dfs(0, -1, 0)
    
    print(" ".join(map(str, counter)))

if __name__ == "__main__":
    main()