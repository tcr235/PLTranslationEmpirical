def check_number():
    n = int(input())
    if n % 10 == 9 or n // 10 == 9:
        print("Yes")
    else:
        print("No")

check_number()