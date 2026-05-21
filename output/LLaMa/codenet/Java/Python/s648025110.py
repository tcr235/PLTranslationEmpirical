import sys

def calculate_heights():
    n = int(input())
    h = list(map(int, input().split()))

    ans = 0
    out = 0

    for i in range(len(h)):
        if out < h[i]:
            ans += (h[i] - out)
            out = h[i]
        else:
            out = h[i]

    return ans

print(calculate_heights())