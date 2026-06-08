from collections import defaultdict
import sys

class Codeforces216B:
    def __init__(self):
        self.count = 0
        self.seen = set()
        self.path = 0
        self.cycle = 1

    def dfs(self, child, par):
        if child in self.seen:
            return self.cycle
        self.seen.add(child)
        for i in self.graph[child]:
            if i != par:
                self.count += 1
                result = self.dfs(i, child)
                if result == self.cycle:
                    return self.cycle
        return self.path

def main():
    input = sys.stdin.read
    data = input().split()
    
    index = 0
    m = int(data[index])
    n = int(data[index + 1])
    index += 2
    
    ft = Codeforces216B()
    ft.graph = defaultdict(list)
    while index + 1 < len(data):
        x = int(data[index])
        y = int(data[index + 1])
        ft.graph[x].append(y)
        ft.graph[y].append(x)
        index += 2
    
    toremove = 0
    for i in range(1, m + 1):
        if i not in ft.seen:
            ft.count = 0
            if ft.dfs(i, 0) == ft.cycle:
                if ft.count % 2 == 1:
                    toremove += 1
    
    if (m - toremove) % 2 == 1:
        toremove += 1
    
    print(toremove)

if __name__ == "__main__":
    main()