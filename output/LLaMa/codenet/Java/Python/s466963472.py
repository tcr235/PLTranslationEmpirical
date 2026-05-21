import sys

def read():
    try:
        d = int(input())
        return True
    except ValueError:
        return False

def solve(d):
    ans = 0
    for i in range(1, 600 // d + 1):
        x = i * d
        y = x * x
        ans += y * d
    return ans

def main():
    while True:
        if not read():
            break
        print(solve(int(input())))

if __name__ == "__main__":
    main()