from sys import stdin, stdout

def main():
    input = stdin.read
    data = input().split()
    
    n = int(data[0])
    a = list(map(long, data[1:n+1]))
    dp = [-1] * (n + 1)
    dp[n - 1] = a[n - 1]
    
    for i in range(n - 2, -1, -1):
        dp[i] = max(dp[i + 1], a[i])
    
    output = []
    for i in range(n):
        if a[i] > dp[i + 1]:
            output.append(0)
        else:
            output.append(dp[i + 1] - a[i] + 1)
    
    print(" ".join(map(str, output)))

if __name__ == "__main__":
    main()