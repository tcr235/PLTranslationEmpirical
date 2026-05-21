import sys

def main():
    str = input().split()
    st = input().split()
    a, b = int(st[0]), int(st[1])
    u = input()
    print(a - 1, b) if u == str[0] else print(a, b - 1)

if __name__ == "__main__":
    main()