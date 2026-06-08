N = int(input().split()[0])
M = int(input().split()[1])
black = [[0] * (N + 2) for _ in range(N + 2)]

for m in range(1, M + 1):
    line = input().split()
    x = int(line[0]) + 1
    y = int(line[1]) + 1
    
    for xx in range(x - 2, x + 2):
        for yy in range(y - 2, y + 2):
            black[xx][yy] += 1
            if xx == x and yy == y:
                if black[x][y] >= 4:
                    print(m)
                    exit()

print("-1")