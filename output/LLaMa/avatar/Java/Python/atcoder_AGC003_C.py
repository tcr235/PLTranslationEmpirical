import heapq
import sys

NUM = int(1e5 + 2)
N = int(input())

map = {}

nums = []
for _ in range(N):
    tmp = int(input())
    heapq.heappush(nums, tmp)
    map[tmp] = _

bin = 0
diff = 0
while nums:
    num = heapq.heappop(nums)
    idx = map[num]
    if (bin % 2) != (idx % 2):
        diff += 1
    bin += 1
    bin %= 2

ans = diff // 2
print(ans)