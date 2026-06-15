import sys
import re

def main():
    n = int(sys.stdin.readline())
    num = [0] * n
    for i in range(n):
        num[i] = i + 1
    count = int(sys.stdin.readline())
    pattern = re.compile(r"(\d+),(\d+)")
    line = [0, 0]
    for i in range(count):
        next = sys.stdin.readline()
        match = re.match(pattern, next)
        if match:
            line[0] = int(match.group(1)) - 1
            line[1] = int(match.group(2)) - 1
            num[line[0]] = num[line[1]]
            num[line[1]] = num[line[0]]
    for i in range(n):
        print(num[i])

if __name__ == "__main__":
    main()
