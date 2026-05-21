import sys

def solve(N, M):
    black = [[0]*(N+2) for _ in range(N+2)]
    
    for m in range(1, M+1):
        x, y = map(int, input().split())
        
        for xx in range(x-1, x+2):
            for yy in range(y-1, y+2):
                black[xx][yy] += 1
                if black[xx][yy] == 9:
                    return m

N = int(input())
M = int(input())
result = solve(N, M)
if result != None:
    print(result)
else:
    print(-1)