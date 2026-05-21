import sys
def main():
    n, m = map(int, input().split())
    po = list(map(int, input().split()))
    while m > 0:
        m = m - po.pop(0)
    po.sort()
    print(n + m//po[0])

if __name__ == "__main__":
    main()