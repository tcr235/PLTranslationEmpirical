def main():
    num_a, num_b, num_c, target_x = map(int, input("Enter four integers separated by space: ").split())

    res = 0

    for i in range(num_a + 1):
        for j in range(num_b + 1):
            for k in range(num_c + 1):
                total = 500 * i + 100 * j + 50 * k
                if total == target_x:
                    res += 1

    print(res)

if __name__ == "__main__":
    main()