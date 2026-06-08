def main():
    sc = input()
    N, max_val, min_val = map(int, sc.split())
    for _ in range(N-1):
        in_val = int(input())
        max_val = max(max_val, in_val)
        min_val = min(min_val, in_val)
    print(max_val - min_val)

if __name__ == "__main__":
    main()