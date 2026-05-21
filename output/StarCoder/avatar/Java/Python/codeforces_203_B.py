N = int(input())
M = int(input())
black = [[0] * (N + 2) for _ in range(N + 2)]

for m in range(1, M + 1):
    x = int(input()) + 1
    y = int(input()) + 1
    
    for xx in range(x - 2, x + 2 + 1):
        for yy in range(y - 2, y + 2 + 1):
            black[xx][yy] += 1
            count = black[x][y]
            
            if count >= 4:
                print(m)
                exit()
                
print("-1")