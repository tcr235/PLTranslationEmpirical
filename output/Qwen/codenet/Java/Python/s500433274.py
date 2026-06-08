from math import gcd
from functools import reduce

def greatest_common_divisor(numbers):
    return reduce(gcd, numbers)

while True:
    try:
        a = int(input())
        b = int(input())
        c = max(a, b)
        if a == c and b != c:
            print("GREATER")
        elif b == c and a != c:
            print("LESS")
        else:
            print("EQUAL")
    except EOFError:
        break