import heapq
import sys

n = int(sys.stdin.readline())
queue = []
for _ in range(n):
    numbers = list(map(int, sys.stdin.readline().split()))
    for number in numbers:
        heapq.heappush(queue, number)

sum_val = 0
for _ in range(n - 1):
    sum_val += heapq.heappop(queue)

print("Yes" if heapq.heappop(queue) < sum_val else "No")