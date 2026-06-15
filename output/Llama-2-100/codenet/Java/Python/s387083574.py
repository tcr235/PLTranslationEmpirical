import sys

N = int(sys.stdin.readline())
map = {}
for i in range(1, N + 1):
    num = int(sys.stdin.readline())
    map[i] = num

print(" ".join(sorted(map.items(), key=lambda x: x[1])))
