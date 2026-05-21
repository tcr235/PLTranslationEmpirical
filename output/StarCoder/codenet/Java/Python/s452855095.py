def main():
    import sys
    input = sys.stdin.read
    data = input().split()

    n = int(data[0])
    arr = list(map(int, data[1:]))

    cnt = 0
    while True:
        all_even = True
        for i in range(n):
            if arr[i] % 2 != 0:
                all_even = False
                break
            else:
                arr[i] = arr[i] // 2

        if all_even:
            cnt += 1
        else:
            break

    print(cnt)

if __name__ == "__main__":
    main()