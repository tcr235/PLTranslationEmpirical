def atcoder_ABC134_E(n):
    map = collections.defaultdict(int)
    for _ in range(n):
        num = int(input())
        if num not in map:
            map[num] = 1 + map.get(map.lower(num), 0)
        else:
            map[map.lower(num)] -= 1
            if map[map.lower(num)] == 0:
                del map[map.lower(num)]
            map[num] = 1 + map.get(num, 0)
    return sum(map.values())

