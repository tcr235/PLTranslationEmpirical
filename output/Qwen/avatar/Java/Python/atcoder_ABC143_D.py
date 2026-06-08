def count_pairs(N, L):
    L.sort()
    count = 0
    for i in range(N):
        for j in range(i + 1, N):
            a = L[i]
            b = L[j]
            res = binary_search(L, j + 1, N - 1, a + b)
            count += res
    return count

def binary_search(li, low, high, target):
    mid = low + (high - low) // 2
    if high - low <= 1:
        return low - mid + 1 if mid < len(li) and li[mid] < target else 0
    elif li[mid] >= target:
        return binary_search(li, low, mid, target)
    else:
        return binary_search(li, mid, high, target)

N = int(input())
L = list(map(int, input().split()))
print(count_pairs(N, L))