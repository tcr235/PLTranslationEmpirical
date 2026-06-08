def main():
    N = int(input())
    max_val, min_val = N, N
    for _ in range(N-1):
        in_val = int(input())
        if in_val > max_val:
            max_val = in_val
        elif in_val < min_val:
            min_val = in_val
    print(max_val - min_val)

if __name__ == "__main__":
    main()