import sys

input = sys.stdin.read
data = input().split()

N = int(data[0])
L = int(data[1])
R = int(data[2])
QL = int(data[3])
QR = int(data[4])

W = list(map(int, data[5:5+N]))
sum_W = [0] * (N + 1)
for i in range(N):
    sum_W[i + 1] = sum_W[i] + W[i]

min_value = float('inf')
for firstR in range(N + 1):
    l_count = firstR
    r_count = N - l_count
    cand = sum_W[l_count] * L + (sum_W[N] - sum_W[l_count]) * R
    ll_count = max(0, l_count - r_count - 1)
    rr_count = max(0, r_count - l_count - 1)
    cand += ll_count * QL + rr_count * QR
    min_value = min(cand, min_value)

print(min_value)