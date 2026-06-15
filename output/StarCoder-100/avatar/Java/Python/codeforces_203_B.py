import sys

N = int(input())
M = int(input())
black = [[0 for i in range(N+2)] for j in range(N+2)]
for m in range(M):
    x = int(input())
    y = int(input())
    for xx in range(x-1, x+2):
        for yy in range(y-1, y+2):
            black[xx][yy] += 1
            if black[xx][yy] == 9:
                print(m+1)
                sys.exit()
print(-1)

