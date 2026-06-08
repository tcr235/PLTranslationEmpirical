def main():
    n = int(input().strip())
    array = [int(num.strip()) for num in input().split()]
    max_val = max(array)
    min_val = min(array)
    print(max_val - min_val)

if __name__ == "__main__":
    main()