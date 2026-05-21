import math

# Update 2019/12/13

def main():
    n = int(input())
    a = int(input())
    b = int(input())

    sa = abs(a - b)

    ans = 0

    if sa % 2 == 0:
        ans = sa // 2
    else:
        AAA = min(n - a, a - 1)
        BBB = min(n - b, b - 1)

        ans = min(AAA, BBB)

        # Remove one unit from sa
        sa -= 1
        ans += 1

        # Units that can be added
        ans += sa // 2

    print(ans)


if __name__ == "__main__":
    main()