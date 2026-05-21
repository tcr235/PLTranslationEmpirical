import sys
from typing import List

def solve(arr: List[int]) -> List[int]:
    n = len(arr)
    dp = [-1] * (n + 1)
    dp[n - 1] = arr[n - 1]
    
    for i in range(n - 1, -1, -1):
        dp[i] = max(dp[i + 1], arr[i])
        
    result = []
    for i in range(n):
        if arr[i] > dp[i + 1]:
            result.append(0)
        else:
            result.append(dp[i + 1] - arr[i] + 1)
            
    return result

if __name__ == "__main__":
    n = int(input())
    arr = list(map(int, input().split()))
    
    result = solve(arr)
    print(*result)