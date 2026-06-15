import sys
input = sys.stdin.readline

class Node:
    def __init__(self, i):
        self.pattern = 0
        self.index = i
        self.children = []
        self.parent = -1

def solve():
    N, K = map(int, input().split())
    nodes = [Node(i) for i in range(N)]
    for i in range(N - 1):
        a, b = map(int, input().split())
        nodes[a - 1].children.append(b - 1)
        nodes[b - 1].children.append(a - 1)
    nodes[0].setParent(K, -1, 0, nodes)
    patterns = 1
    for i in range(N):
        patterns = (patterns * nodes[i].pattern) % 1_000_000_007
    print(patterns)

if __name__ == '__main__':
    solve()

