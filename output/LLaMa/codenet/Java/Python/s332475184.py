from queue import deque

class FastScanner:
    def __init__(self):
        self.stdin = input
        self.buffer = ''
        self.ptr = 0
        self.buflen = 0

    def hasNextByte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            try:
                self.buflen = self.stdin().encode().len()
                self.buffer = self.stdin()
            except EOFError:
                pass
            if self.buflen <= 0:
                return False
        return True

    def readline(self):
        if not self.hasNextByte():
            return None
        line = ''
        while self.hasNextByte() and self.buffer[self.ptr].isspace():
            self.ptr += 1
        while self.hasNextByte() and not self.buffer[self.ptr].isspace():
            line += self.buffer[self.ptr]
            self.ptr += 1
        return line

    def next(self):
        while True:
            line = self.readline()
            if line:
                line = line.strip()
                if line:
                    return line

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

graph = []
counter = []
for _ in range(int(input())):
    graph.append([])
for _ in range(int(input())-1):
    a, b = map(int, input().split())
    graph[a-1].append(b-1)
    graph[b-1].append(a-1)
for _ in range(int(input())):
    node, val = map(int, input().split())
    counter.append((node-1, val))
visited = set()

def dfs(node, par, val):
    visited.add(node)
    for nei in graph[node]:
        if nei != par:
            dfs(nei, node, val + counter[node][1])
    counter[node][1] += val
    if not visited:
        counter[node][1] = 0

for i in [x[0] for x in counter]:
    dfs(i, -1, 0)

print(*[x[1] for x in counter])