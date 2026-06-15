def main():
    sc = input()

    k = sc.nextLong()
    a = sc.nextLong()
    b = sc.nextLong()

    if b <= a + 2:
        print(1 + k)
        return

    x = k - (a - 1)
    ans = a + (x // 2) * (b - a) + (x % 2)

    print(ans)

