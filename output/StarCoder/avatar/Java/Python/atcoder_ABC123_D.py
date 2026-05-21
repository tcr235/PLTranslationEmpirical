def main():
    import sys
    input = sys.stdin.read
    data = input().split()

    x = [int(data[0]), int(data[1]), int(data[2])]
    max_val = 0

    for i in range(3):
        max_val = max(max_val, x[i])

    k = int(data[max_sum_index])

    a = [[] for _ in range(3)]

    for i in range(3):
        for j in range(x[i]):
            a[i].append(int(data[(max_sum_index + 4) + (i * x[i] + j)]))

    for i in range(3):
        a[i].sort()

    result = []

    for i in range(x[0]):
        for j in range(x[1]):
            for m in range(x[2]):
                if (i + 1) * (j + 1) * (m + 1) <= k:
                    tmp = a[0][x[0] - i - 1] + a[1][x[1] - j - 1] + a[2][x[2] - m - 1]
                    result.append(tmp)

    result.sort(reverse=True)

    for i in range(k):
        print(result[i])

if __name__ == "__main__":
    main()