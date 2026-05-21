N = 1e5 + 5

cnt = [0] * 21

n = int(input())
for _ in range(n):
    cnt[int(input()) + 10] += 1

res = 0
for i in range(10):
    res += cnt[i] * cnt[20 - i]

res += (cnt[10] * (cnt[10] - 1)) // 2

print(res)