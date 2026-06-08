def main():
    sc = input().split(' ')
    n = int(sc[0])
    minN = int(sc[1]) - 1
    h = [int(t) - 1 for t in input().split(' ')][1:-1]
    for i in range(n - 1):
        if h[i] < minN:
            minN = h[i]
        elif h[i] == minN:
            continue
        elif h[i] > minN:
            if minN >= h[i] - 1:
                minN = h[i] - 1
            else:
                print("No")
                return
    print("Yes")

if __name__ == "__main__":
    main()