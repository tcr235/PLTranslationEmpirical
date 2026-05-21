import sys

def main():
    n = int(sys.stdin.read().strip())
    d = 0
    for i in range(n):
        d += int(sys.stdin.read().strip()) % 2
    print("YES" if d % 2 == 0 else "NO")

if __name__ == "__main__":
    main()