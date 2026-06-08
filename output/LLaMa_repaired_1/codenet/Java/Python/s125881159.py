def main():
    nums = list(map(int, input().split()))
    d = sum(num % 2 for num in nums)
    print("YES" if d % 2 == 0 else "NO")

main()