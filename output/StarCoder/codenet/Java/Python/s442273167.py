n = int(input())
l = [int(input()) for _ in range(n)]
r = [int(input()) for _ in range(n)]
sum = sum(r[i] - l[i] + 1 for i in range(n))
print(sum)