import heapq

def main():
    # write your code here
    n = int(input())
    queue = []
    for _ in range(n):
        heapq.heappush(queue, int(input()))
    
    sum_value = 0
    for _ in range(n - 1):
        sum_value += heapq.heappop(queue)
    
    print("Yes" if queue[0] < sum_value else "No")

main()