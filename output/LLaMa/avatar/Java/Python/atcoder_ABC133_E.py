import sys
import math

class Node:
    def __init__(self, i):
        self.pattern = 0
        self.index = i
        self.children = []
        self.parent = -1

    def set_parent(self, K, parent, use, nodes):
        self.pattern = K - use
        self.parent = parent
        count = 1
        if parent != -1:
            count += 1
        for n in self.children:
            if n == self.parent:
                continue
            nodes[n].set_parent(K, self.index, count, nodes)
            count += 1


def solve():
    N = int(input())
    K = int(input())
    nodes = [Node(i) for i in range(N)]
    for i in range(N - 1):
        a = int(input()) - 1
        b = int(input()) - 1
        nodes[a].children.append(b)
        nodes[b].children.append(a)

    nodes[0].set_parent(K, -1, 0, nodes)
    patterns = 1
    for i in range(N):
        patterns = (patterns * nodes[i].pattern) % 10**9 + 7
    print(patterns)


def main():
    solve()


if __name__ == "__main__":
    main()