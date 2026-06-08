import sys

def calculate_answer():
    n = int(input())
    a = [int(x) for x in input().split()]
    a.sort()
    ans = 0
    for j in range(1, n):
        if j == 1 or a[j] != a[j - 1]:
            tmp = 1
            for i in range(j + 1, n):
                if a[j] == a[i]:
                    tmp += 1
                else:
                    break
            if tmp > a[j]:
                ans += tmp - a[j]
            elif tmp < a[j]:
                ans += tmp
    if n == 1 and a[0] > 1:
        ans = 1
    print(ans)

calculate_answer()