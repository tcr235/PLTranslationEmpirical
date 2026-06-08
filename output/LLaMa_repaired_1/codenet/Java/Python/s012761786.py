import sys

def next():
    return sys.stdin.readline().strip()

def next_int():
    return int(next())

def next_long():
    return int(next())

def next_double():
    return float(next())

def split_string(s):
    return s.split()

def split_char(s):
    return list(s)

def char_to_int(char):
    return int(char)

def max_int(a, lng):
    return max(a[:lng])

def min_int(a, lng):
    return min(a[:lng])

def max_long(a, lng):
    return max(a[:lng])

def min_long(a, lng):
    return min(a[:lng])

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