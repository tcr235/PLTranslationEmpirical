from typing import Dict, List
import sys

class Point:
    def __init__(self, name: int):
        self.name = name
        self.friends: Dict[Point, int] = {}

    def become_friend(self, p: 'Point', length: int):
        self.friends[p] = length


def dfs(p: Point, length: int, colors: List[int], name_map: Dict[int, Point]) -> None:
    if colors[p.name] != -1:
        return
    if length % 2 == 0:
        colors[p.name] = 0
    else:
        colors[p.name] = 1
    for friend, length2 in p.friends.items():
        dfs(friend, length + length2, colors, name_map)


def main():
    n = int(input())
    colors = [-1] * n
    points: List[Point] = [Point(i) for i in range(n)]
    name_map: Dict[int, Point] = {i: p for i, p in enumerate(points)}
    
    for _ in range(n - 1):
        edges = list(map(int, input().split()))
        me = edges[0] - 1
        you = edges[1] - 1
        length = edges[2]
        points[me].become_friend(points[you], length)
        points[you].become_friend(points[me], length)

    dfs(points[0], 0, colors, name_map)
    for c in colors:
        print(c)


if __name__ == "__main__":
    main()