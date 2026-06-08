import sys

def read():
    s = ''
    while True:
        byte = sys.stdin.buffer.readline()
        s += byte.decode('utf-8')
        if not byte:
            break
    while True:
        try:
            d = int(input())
            return True
        except ValueError:
            message = input()
            if d == -1:
                sys.exit()
            elif '*' in s:
                break

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
        print(solve(int(input()) if read() else -1))

if __name__ == "__main__":
    main()