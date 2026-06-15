import sys
input = sys.stdin.readline

n = int(input())
L = []
for i in range(n):
    L.append(int(input()))
L.sort()

count = 0
for i in range(n):
    for j in range(i+1, n):
        a = L[i]
        b = L[j]
        res = find(L, j+1, a+b)
        count += res
print(count)

def find(li, from_, target):
    low = from_
    upp = len(li) - 1
    mid = (upp - low + 1) // 2
    if upp - low < 0:
        return 0
    elif li[from_] >= target:
        return 0
    elif li[upp] < target:
        return upp - low + 1
    while upp - low > 1:
        if li[mid] >= target:
            upp = mid
        else:
            low = mid
        mid = (upp - low + 1) // 2
    return low - from_ + 1

