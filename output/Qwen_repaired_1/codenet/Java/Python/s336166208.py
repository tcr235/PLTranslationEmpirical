info = [[[0 for _ in range(10)] for _ in range(3)] for _ in range(4)]

n = int(input('n value: '))
for _ in range(n):
    data = input().split()
    built = int(data[0]) - 1
    floor = int(data[1]) - 1
    room = int(data[2]) - 1
    num = int(data[3])
    info[built][floor][room] += num

for i in range(4):
    for j in range(3):
        for k in range(10):
            print(f" {info[i][j][k]}", end="")
        print()
    if i != 3:
        print("####################")