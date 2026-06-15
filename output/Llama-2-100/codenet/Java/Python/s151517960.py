def main():
    n = int(input())
    map = {}
    for i in range(n):
        a = int(input())
        if a in map:
            map[a] += 1
        else:
            map[a] = 1
    ans = 0
    for key in map.keys():
        if map[key] % 2:
            ans += 1
    print(ans)
