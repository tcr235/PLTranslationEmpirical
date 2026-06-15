import sys

def main():
    a = int(sys.stdin.readline())
    b = int(sys.stdin.readline())
    c = int(sys.stdin.readline())
    count = 0
    for i in range(a, b+1):
        if c % i == 0:
            count += 1
    print(count)
