n, a, b = map(int, input().split())
list1, list2 = [], []
for _ in range(a):
    list1.append(int(input()))
for _ in range(b):
    list2.append(int(input()))
for i in range(n):
    if list1.count(i + 1) > 0:
        print(1, end=" ")
    else:
        print(2, end=" ")