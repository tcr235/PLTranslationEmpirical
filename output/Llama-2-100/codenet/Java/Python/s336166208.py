def main():
    info = [[0 for j in range(3)] for i in range(4)]
    for i in range(4):
        for j in range(3):
            for k in range(10):
                info[i][j][k] = 0
    sc = input()
    n = int(sc)
    for i in range(n):
        built = int(sc)
        floor = int(sc)
        room = int(sc)
        num = int(sc)
        info[built - 1][floor - 1][room - 1] += num
    for i in range(4):
        for j in range(3):
            for k in range(10):
                print(" " + str(info[i][j][k]), end="")
            print("\n")
            if i != 4 - 1:
                print("####################\n")
