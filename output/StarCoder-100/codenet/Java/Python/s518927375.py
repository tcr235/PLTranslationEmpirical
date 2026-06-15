import sys

def main():
    k = int(sys.stdin.readline())
    a = int(sys.stdin.readline())
    b = int(sys.stdin.readline())

    if b <= a + 2:
        print(1 + k)
        return

    x = k - (a - 1)
    ans = a + (x / 2) * (b - a) + (x % 2)

    print(ans)

if __name__ == '__main__':
    main()

