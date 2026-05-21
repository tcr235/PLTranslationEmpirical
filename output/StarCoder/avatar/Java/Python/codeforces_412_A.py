import sys

input = sys.stdin.read
data = input().split()

n = int(data[0])
k = int(data[1])
a = data[2]

if k > n // 2:
    while k < n:
        print("RIGHT")
        k += 1
else:
    while k > 1:
        print("LEFT")
        k -= 1

if k == 1:
    for char in a:
        print(f"PRINT {char}")
        if next_char := a[a.index(char) + 1:]:
            print("RIGHT")
else:
    for i in range(len(a) - 1, -1, -1):
        print(f"PRINT {a[i]}")
        if prev_char := a[:i]:
            print("LEFT")