class Node:
    def __init__(self, index):
        self.index = index
        self.children = []
        self.parent = -1

    def setParent(self, K, parent, use, nodes):
        self.pattern = K - use
        self.parent = parent
        count = 1
        if parent != -1:
            count += 1
        for child in self.children:
            if child == self.parent:
                continue
            child.setParent(K, index, count, nodes)
            count += 1

class atcoder_ABC133_E:
    def __init__(self):
        self.nodes = [Node(i) for i in range(N)]

    def solve(self):
        scanner = Scanner(System.in)
        N = scanner.nextInt()
        K = scanner.nextInt()
        for i in range(N):
            a = scanner.nextInt() - 1
            b = scanner.nextInt() - 1
            self.nodes[a].children.append(b)
            self.nodes[b].children.append(a)
        scanner.close()
        self.nodes[0].setParent(K, -1, 0, self.nodes)
        patterns = 1
        for i in range(N):
            patterns = (patterns * self.nodes[i].pattern) % 1_000_000_007
        print(patterns)

if __name__ == "__main__":
    atcoder_ABC133_E().solve()

