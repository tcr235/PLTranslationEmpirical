import heapq

n = int(input())
queue = []
for i in range(n):
    queue.append(int(input()))

sum_val = 0
for i in range(n - 1):
    sum_val += heapq.heappop(queue)

print("Yes" if heapq.heappop(queue) < sum_val else "No")