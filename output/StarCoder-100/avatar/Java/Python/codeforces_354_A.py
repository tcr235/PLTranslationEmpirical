import sys

def main():
    N = int(raw_input())
    L = int(raw_input())
    R = int(raw_input())
    QL = int(raw_input())
    QR = int(raw_input())
    W = map(int, raw_input().split())
    sum = [0] * (N + 1)
    for i in range(N):
        sum[i + 1] = sum[i] + W[i]
    min = sys.maxint
    for firstR in range(N + 1):
        lCount = firstR
        rCount = N - lCount
        cand = sum[lCount] * L + (sum[N] - sum[lCount]) * R
        llCount = max(0, lCount - rCount - 1)
        rrCount = max(0, rCount - lCount - 1)
        cand += llCount * QL
        cand += rrCount * QR
        min = min(min, cand)
    print min

if __name__ == '__main__':
    main()

