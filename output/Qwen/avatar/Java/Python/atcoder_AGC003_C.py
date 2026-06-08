import heapq

NUM = int(1e5 + 2)

def main():
    scanner = input()
    N = int(scanner.split()[0])
    map_ = {}
    nums = []
    
    for i in range(N):
        tmp = int(scanner.split()[i+1])
        heapq.heappush(nums, (-tmp, i))  # Using negative value for max heap like behavior in Python
        map_[tmp] = i
    
    bin_ = 0
    diff = 0
    
    while nums:
        num, idx = heapq.heappop(nums)
        num = -num  # Convert back to positive
        
        if (bin_ % 2) != (idx % 2):
            diff += 1
        
        bin_ += 1
        bin_ %= 2
    
    ans = diff // 2
    print(ans)

if __name__ == "__main__":
    main()