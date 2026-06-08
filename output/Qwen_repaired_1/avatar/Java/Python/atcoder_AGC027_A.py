def main():
    sc = input().split()
    N = int(sc[0])
    x = int(sc[1])
    sweet = list(map(int, sc[2:]))
    sweet.sort()
    num = 0
    while num < len(sweet) and x - sweet[num] >= 0:
        x -= sweet[num]
        num += 1
    if num == len(sweet) and x > 0:
        num -= 1
    print(num)

main()