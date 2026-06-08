import heapq

def main():
    n = int(input())
    numbers = list(map(int, input().split()))
    queue = []
    for num in numbers:
        heapq.heappush(queue, num)
    
    sum_value = 0
    for _ in range(n - 1):
        sum_value += heapq.heappop(queue)
    
    print("Yes" if queue[0] < sum_value else "No")

main()