import sys
import math

def main():
    data = list(map(int, sys.stdin.read().split()))
    n = data[0]
    arr = data[1:]
    ans = arr[0] + 1
    for i in range(1, len(arr)):
        ans += abs(arr[i] - arr[i-1]) + 2
    print(ans)

if __name__ == "__main__":
    main()