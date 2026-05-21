import sys

def codeforces_354_A():
    input = sys.stdin.readline
    N, L, R, QL, QR = map(int, input().split())
    W = list(map(int, input().split()))
    sum_ = [0] * (N + 1)
    for n in range(N):
        W[n] = int(input())
        sum_[n + 1] = sum_[n] + W[n]

    min_ = float('inf')
    for firstR in range(N + 1):
        lCount = firstR
        rCount = N - lCount
        cand = sum_[lCount] * L + (sum_[N] - sum_[lCount]) * R
        llCount = max(0, lCount - rCount - 1)
        rrCount = max(0, rCount - lCount - 1)
        cand += llCount * QL
        cand += rrCount * QR
        min_ = min(min_, cand)

    print(min_)

codeforces_354_A()