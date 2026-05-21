import sys

def main():
    m = int(input())
    n = int(input())
    x = int(input())
    y = int(input())
    a = list(map(int, input().split()))[:m]
    b = list(map(int, input().split()))[:n]
    
    x_max = max_int(x, a)
    y_min = min_int(y, b)
    
    check_war(x_max, y_min)

def max_int(x, a):
    bignum = x
    for i in range(len(a)):
        bignum = max(bignum, a[i])
    return bignum

def min_int(y, b):
    smallnum = y
    for i in range(len(b)):
        smallnum = min(smallnum, b[i])
    return smallnum

def check_war(a, b):
    if a >= b:
        print("War")
    else:
        print("No War")

if __name__ == "__main__":
    main()