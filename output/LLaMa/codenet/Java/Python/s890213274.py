input_list = list(map(int, input().split()))

if sum(input_list) >= 22:
    print("bust")
else:
    print("win")