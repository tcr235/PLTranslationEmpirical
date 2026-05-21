def main():
    n = int(input())
    numbers = [int(input()) for _ in range(n)]
    even_sum = sum(filter(lambda x: x % 2 == 0, numbers))
    odd_numbers = sorted(filter(lambda x: x % 2 != 0, numbers))
    total_sum = even_sum + sum(odd_numbers)
    if len(odd_numbers) % 2 != 0:
        total_sum -= odd_numbers[0]
    print(total_sum)

main()