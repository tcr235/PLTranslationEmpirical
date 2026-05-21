def main():
    n = int(input())
    array = [int(input()) for _ in range(n)]
    max_val = max(array)
    min_val = min(array)
    print(max_val - min_val)

if __name__ == "__main__":
    main()