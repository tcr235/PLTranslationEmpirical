def main():
    n = int(input())
    list_ = []
    for _ in range(n):
        list_.append(int(input()))
    even_sum = sum(x for x in list_ if x % 2 == 0)
    odd_list = sorted([x for x in list_ if x % 2 != 0])
    total_sum = even_sum + sum(odd_list)
    if len(odd_list) % 2 != 0:
        total_sum -= odd_list[0]
    print(total_sum)

main()