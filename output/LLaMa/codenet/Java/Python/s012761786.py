import math

def next_int():
    return int(input())

def next_long():
    return int(input())

def next_double():
    return float(input())

def max_int(a, lng):
    max = a[0]
    for i in range(1, lng):
        max = max(max, a[i])
    return max

def min_int(a, lng):
    min = a[0]
    for i in range(1, lng):
        min = min(min, a[i])
    return min

def max_long(a, lng):
    max = a[0]
    for i in range(1, lng):
        max = max(max, a[i])
    return max

def min_long(a, lng):
    min = a[0]
    for i in range(1, lng):
        min = min(min, a[i])
    return min

def main():
    n = next_long()
    a = next_long()
    b = next_long()

    sa = abs(a - b)

    ans = 0

    if sa % 2 == 0:
        ans = sa // 2
    else:
        AAA = min((n - a), (a - 1))
        BBB = min((n - b), (b - 1))

        ans = min(AAA, BBB)

        sa -= 1
        ans += 1

        ans += sa // 2

    print(ans)

if __name__ == "__main__":
    main()