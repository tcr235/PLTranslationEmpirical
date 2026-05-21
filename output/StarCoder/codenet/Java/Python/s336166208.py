info = [[[0 for _ in range(10)] for _ in range(3)] for _ in range(4)]

n = int(input())
for _ in range(n):
    built = int(input()) - 1
    floor = int(input()) - 1
    room = int(input()) - 1
    num = int(input())
    info[built][floor][room] += num

for i in range(4):
    for j in range(3):
        for k in range(10):
            print(f" {info[i][j][k]}", end="")
        print()
    if i != 3:
        print("####################")