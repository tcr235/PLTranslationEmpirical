def solve():
    n = int(input())
    list = []
    current_number = 0
    for _ in range(n):
        number = input().split()
        current_number = int(number[0])
        list.append(current_number)

    odd = []
    total_sum = 0
    for i in list:
        if i % 2 == 0:
            total_sum += i
        else:
            odd.append(i)

    odd.sort()
    for i in odd:
        total_sum += i

    if len(odd) % 2 != 0:
        total_sum -= odd[0]

    print(total_sum)

solve()