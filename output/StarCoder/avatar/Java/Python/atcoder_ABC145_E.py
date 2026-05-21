def atcoder_ABC145_E(N, T, AB):
    AB.sort(key=lambda x: x[0])
    dp = [[0] * 6001 for _ in range(N + 1)]
    
    for i in range(1, N + 1):
        time = AB[i - 1][0]
        value = AB[i - 1][1]
        
        for tte in range(6001):
            dp[i][tte] = max(dp[i][tte], dp[i - 1][tte])
            if 0 <= tte - time and tte - time < T:
                dp[i][tte] = max(dp[i][tte], dp[i - 1][tte - time] + value)
    
    return max(dp[N])

# Read input
N, T = map(int, input().split())
AB = [tuple(map(int, input().split())) for _ in range(N)]

# Print result
print(atcoder_ABC145_E(N, T, AB))