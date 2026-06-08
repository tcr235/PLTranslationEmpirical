from functools import reduce
from operator import gcd

def find_least_common_multiple(x, y):
    return x * y // gcd(x, y)

def main():
    n, m = map(int, input().split())
    s = input().strip()
    t = input().strip()

    common_divisor = gcd(n, m)
    
    try:
        all_equal = all(s[(k * n) // common_divisor] == t[(k * m) // common_divisor] for k in range(common_divisor))
        result = -1 if not all_equal else find_least_common_multiple(n, m)
    except IndexError:
        result = -1
    
    print(result)

if __name__ == "__main__":
    main()