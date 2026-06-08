import sys

def main():
    input_data = sys.stdin.read().split()
    n = int(input_data[0])
    d = sum(int(x) % 2 for x in input_data[1:])
    print("YES" if d % 2 == 0 else "NO")

if __name__ == "__main__":
    main()