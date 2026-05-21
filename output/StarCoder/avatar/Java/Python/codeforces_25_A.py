def codeforces_25_A():
    n = int(input())
    array = [int(input()) for _ in range(n)]
    odd = 0
    even = 0
    odd_ind = -1
    even_ind = -1

    for i in range(1, len(array) + 1):
        if array[i - 1] % 2 == 0:
            even += 1
            even_ind = i
        else:
            odd += 1
            odd_ind = i
    
    if odd > even:
        print(even_ind)
    else:
        print(odd_ind)

codeforces_25_A()