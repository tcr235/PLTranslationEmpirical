def calculate_differences(n, arr):
    max_diff = 0
    min_diff = float('inf')
    
    for i in range(n):
        max_diff = max(arr[i] - arr[0], arr[-1] - arr[i])
        if i == 0:
            min_diff = arr[i + 1] - arr[i]
        elif i == n - 1:
            min_diff = arr[i] - arr[i - 1]
        else:
            min_diff = min(arr[i] - arr[i - 1], arr[i + 1] - arr[i])
        
        print(min_diff, max_diff)

n = int(input())
arr = list(map(int, input().split()))

calculate_differences(n, arr)