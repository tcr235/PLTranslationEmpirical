```python
from sys import stdin
from collections import deque

class FastScanner:
    def __init__(self):
        self.stdin = stdin
        self.buffer = ''
        self.ptr = 0
        self.buflen = 0

    def hasNextByte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            try:
                self.buflen = self.stdin.buffer.read(self.ptr).decode().encode().len()
                self.buffer = self.stdin.buffer.read(self.ptr).decode()
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

class Graph:
    def __init__(self):
        self.vertices = []
        self.adjacency_list = []

    def configure_graph(self, n):
        self.vertices = [[] for _ in range(n)]
        self.adjacency_list = [[] for _ in range(n)]

    def add_edge(self, u, v):
        self.vertices[u].append(v)
        self.vertices[v].append(u)

def dfs(v, par, graph, counter):
    visited = set()
    dfs_helper(v, par, graph, counter, visited)

def dfs_helper(v, par, graph, counter, visited):
    if v not in visited:
        visited.add(v)
        for nei in graph.vertices[v]:
            if nei != par:
                dfs_helper(nei, v, graph, counter, visited)
        counter[v] += visited.pop() # Obtain the popped value from visited set

def main():
    fs = FastScanner()
    n = fs.next_int()
    q = fs.next_int()
    graph = Graph()
    graph.configure_graph(n)

    counter = [0] * n
    for _ in range(n-1):
        a = fs.next_int()-1