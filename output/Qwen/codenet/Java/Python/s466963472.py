def main():
    while True:
        try:
            d = int(input())
            print(solve(d))
        except EOFError:
            break

def solve(d):
    ans = 0
    for i in range(1, (599//d) + 1):
        x = i * d
        y = x * x
        ans += y * d
    return ans

if __name__ == "__main__":
    main()