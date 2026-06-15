n = int(input())
l = [int(input()) for i in range(n)]
r = [int(input()) for i in range(n)]
sum = 0
for i in range(n):
	sum += r[i] - l[i] + 1
print(sum)

