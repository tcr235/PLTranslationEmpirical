import sys

n, a, b = map(int, input().split())
list1 = list(map(int, input().split()))[:a]
list2 = list(map(int, input().split()))[:b]

for i in range(1, n + 1):
    if i in list1:
        print(1, end=" ")
    else:
        print(2, end=" ")