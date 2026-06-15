def main():
    n = int(input())
    nums = [int(input()) for _ in range(n)]

    min = float('inf')
    count_negatives = 0
    sum = 0
    for num in nums:
        abs = abs(num)
        sum += abs
        min = min(min, abs)
        if num < 0:
            count_negatives += 1

    print(count_negatives % 2 == 0, sum)
