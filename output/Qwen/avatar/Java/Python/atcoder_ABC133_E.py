class Node:
    def __init__(self, i):
        self.pattern = 0
        self.index = i
        self.children = []
        self.parent = -1

    def set_parent(self, K, parent, use, nodes):
        self.pattern = K - use
        count = 1
        if parent != -1:
            count += 1
        for n in self.children:
            if n == self.parent:
                continue
            nodes[n].set_parent(K, self.index, count, nodes)
            count += 1


class AtCoder_ABC133_E:
    def solve(self):
        N = int(input())
        K = int(input())
        nodes = [Node(i) for i in range(N)]
        for _ in range(N - 1):
            a = int(input()) - 1
            b = int(input()) - 1
            nodes[a].children.append(b)
            nodes[b].children.append(a)
        nodes[0].set_parent(K, -1, 0, nodes)
        patterns = 1
        for node in nodes:
            patterns = (patterns * node.pattern) % 1_000_000_007
        print(patterns)


if __name__ == "__main__":
    AtCoder_ABC133_E().solve()