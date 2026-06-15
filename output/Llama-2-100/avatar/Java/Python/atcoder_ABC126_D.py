def dfs(p, length):
    already_known = colors[p.name] != -1
    if already_known:
        return
    if length % 2 == 0:
        colors[p.name] = 0
    else:
        colors[p.name] = 1
    for friend in p.friends.values():
        dfs(friend, length + friend)

def main():
    n = int(input())
    m = n - 1
    colors = [ -1 ] * n
    points = [Point(i) for i in range(n)]
    while m > 0:
        me = int(input()) - 1
        you = int(input()) - 1
        length = int(input())
        points[me].becomeFriend(points[you], length)
        points[you].becomeFriend(points[me], length)
    dfs(points[0], 0)
    for c in colors:
        print(c)

class Point:
    def __init__(self, name):
        self.name = name
        self.friends = {}

    def becomeFriend(self, friend, length):
        self.friends[friend] = length

main()
