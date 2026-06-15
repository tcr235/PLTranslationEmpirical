import math
import sys

def main():
    input = sys.stdin.readline
    N, M = map(int, input().split())
    S = input().rstrip()
    T = input().rstrip()
    gcd = math.gcd(N, M)
    ans = 0
    for i in range(gcd):
        if S[i * N // gcd]!= T[i * M // gcd]:
            ans = -1
            break
    if ans == 0:
        ans = N * M // gcd
    print(ans)

if __name__ == '__main__':
    main()

