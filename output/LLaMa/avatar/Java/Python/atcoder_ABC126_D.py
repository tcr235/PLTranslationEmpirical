import sys
from typing import Dict, List

class Point:
    def __init__(self, name: int):
        self.name = name
        self.friends: Dict[Point, int] = {}

    def become_friend(self, p: 'Point', length: int):
        self.friends[p] = length


def dfs(p: Point, length: int, colors: List[int]) -> None:
    if colors[p.name] != -1:
        return
    if length % 2 == 0:
        colors[p.name] = 0
    else:
        colors[p.name] = 1
    for friend, length2 in p.friends.items():
        dfs(friend, length + length2, colors)


def main():
    n = int(input())
    colors = [-1] * n
    points = [Point(i) for i in range(n)]
    for _ in range(n - 1):
        me = int(input()) - 1
        you = int(input()) - 1
        length = int(input())
        points[me].become_friend(points[you], length)
        points[you].become_friend(points[me], length)
    dfs(points[0], 0, colors)
    for c in colors:
        print(c)


if __name__ == "__main__":
    main()