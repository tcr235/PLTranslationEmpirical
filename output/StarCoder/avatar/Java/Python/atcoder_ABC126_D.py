from collections import defaultdict

class Point:
    def __init__(self, name):
        self.name = name
        self.friends = defaultdict(int)

def dfs(p, length, colors):
    already_known = colors[p.name] != -1
    if already_known: return
    if length % 2 == 0:
        colors[p.name] = 0
    else:
        colors[p.name] = 1
    for friend in p.friends:
        dfs(friend, length + p.friends[friend], colors)

def main():
    sc = input()
    n = int(sc.split()[0])
    m = n - 1
    colors = [-1] * n
    points = [Point(i) for i in range(n)]
    for _ in range(m):
        sc = input()
        me, you, length = map(int, sc.split())
        me -= 1
        you -= 1
        points[me].friends[points[you]] = length
        points[you].friends[points[me]] = length
    dfs(points[0], 0, colors)
    for c in colors:
        print(c)

if __name__ == '__main__':
    main()