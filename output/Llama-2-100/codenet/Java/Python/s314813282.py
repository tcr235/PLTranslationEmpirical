def max_int(x, a):
    max_val = x
    for i in range(len(a)):
        max_val = max(max_val, a[i])
    return max_val

def min_int(y, b):
    min_val = y
    for i in range(len(b)):
        min_val = min(min_val, b[i])
    return min_val

def check_war(a, b):
    if a >= b:
        print("War")
    else:
        print("No War")

a = int(input())
b = int(input())
x = int(input())
y = int(input())

a_arr = [int(input()) for _ in range(a)]
b_arr = [int(input()) for _ in range(b)]

x_max = max_int(x, a_arr)
y_min = min_int(y, b_arr)

check_war(x_max, y_min)
