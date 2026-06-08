import sys

def main():
    input = sys.stdin.read
    data = input().split()

    n = int(data[0])
    a = sum(int(data[i]) for i in range(1, n + 1))
    b = sum(int(data[n + i]) for i in range(n - 1))
    c = sum(int(data[2 * n - 1 + i]) for i in range(n - 2))

    x = a - b
    y = b - c

    print(x)
    print(y)

if __name__ == "__main__":
    main()