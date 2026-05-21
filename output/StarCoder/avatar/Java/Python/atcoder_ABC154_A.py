import sys

def main():
    input = sys.stdin.read
    data = input().split()
    a = int(data[2])
    b = int(data[3])
    u = data[4]

    if u == data[0]:
        print(f"{a-1} {b}")
    else:
        print(f"{a} {b-1}")

if __name__ == "__main__":
    main()