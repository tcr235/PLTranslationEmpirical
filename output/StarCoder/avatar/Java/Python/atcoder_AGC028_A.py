from math import gcd

def main():
    n = int(input())
    m = int(input())
    s = input()
    t = input()

    common_divisor = gcd(n, m)
    for i in range(common_divisor):
        if s[i * n // common_divisor] != t[i * m // common_divisor]:
            print(-1)
            return
    print((n * m) // common_divisor)

if __name__ == "__main__":
    main()