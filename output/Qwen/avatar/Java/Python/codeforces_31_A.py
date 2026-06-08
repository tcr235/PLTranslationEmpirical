def find_triple_sum(n, a):
    for k in range(n):
        target = a[k]
        for i in range(n):
            for j in range(i+1, n):
                if a[i] + a[j] == target:
                    return k+1, i+1, j+1
    return -1

n = int(input())
a = list(map(int, input().split()))
result = find_triple_sum(n, a)
if result != -1:
    print(" ".join(map(str, result)))
else:
    print("-1")