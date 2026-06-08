N = int(1e5 + 5)

cnt = [0] * 21

n = int(input())
nums = []
for _ in range(n):
    num = int(input())
    nums.append(num)
    
for num in nums:
    cnt[num + 10] += 1

res = 0
for i in range(10):
    res += cnt[i] * cnt[20 - i]

res += (cnt[10] * (cnt[10] - 1)) // 2

print(res)