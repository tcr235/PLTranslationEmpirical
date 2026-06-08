def main():
    inputs = input().split()
    k = int(inputs[0])
    a = int(inputs[1])
    b = int(inputs[2])

    if b <= a + 2:
        print(1 + k)
        return

    x = k - (a - 1)
    ans = a + (x // 2) * (b - a) + (x % 2)

    print(ans)

if __name__ == "__main__":
    main()