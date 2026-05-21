n = int(input())
array = [input() for _ in range(n)]
array.sort()
cnt = 1

for i in range(1, n):
    if array[i] != array[i - 1]:
        cnt += 1

print(cnt)