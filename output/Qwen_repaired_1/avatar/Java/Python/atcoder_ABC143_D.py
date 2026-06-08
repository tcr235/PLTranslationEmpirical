from bisect import bisect_left

def count_pairs(N, L):
    L.sort()
    count = 0
    for i in range(N):
        for j in range(i + 1, N):
            a = L[i]
            b = L[j]
            target = a + b
            k = bisect_left(L, target, key=lambda x: x-a-b)
            count += N - max(j + 1, k)
    return count

N = int(input())
L = list(map(int, input().split()))
print(count_pairs(N, L))