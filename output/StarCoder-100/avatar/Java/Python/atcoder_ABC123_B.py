import sys
import collections

def main():
    input = sys.stdin.readline
    N = int(input())
    A = list(map(int, input().split()))
    R = [a % 10 for a in A]
    B = collections.defaultdict(int)
    for i, a in enumerate(A):
        if R[i]!= 0:
            B[10 - R[i]] += a
        else:
            B[0] += a
    ans = 0
    if len(B) == 0:
        for a in A:
            ans += a
        print(ans)
        return
    last = B[max(B.keys())]
    idx = 0
    for i, a in enumerate(A):
        if a == last:
            idx = i
    for i, a in enumerate(A):
        if i!= idx:
            if a % 10 == 0:
                ans += a
            else:
                ans += a + (10 - R[i])
    ans += last
    print(ans)


if __name__ == '__main__':
    main()

