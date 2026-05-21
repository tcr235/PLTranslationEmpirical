import sys

def get_input():
    try:
        return input().strip().split(" ")
    except Exception as e:
        return []

def main():
    x = get_input()
    if len(x) >= 2:
        a = int(x[0])
        b = int(x[1])
        c = a - b * 2
        if c < 0:
            c = 0
        print(c)

if __name__ == "__main__":
    main()