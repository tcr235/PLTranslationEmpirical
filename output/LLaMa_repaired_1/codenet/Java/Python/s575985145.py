def main():
    size = int(input())
    graph = [[0]*size for _ in range(size)]

    for i in range(size):
        id, cols, *row_indexes = map(int, input().split())
        row = [0] * size
        for index in row_indexes:
            row[index - 1] = 1
        graph[id - 1] = row

    for line in graph:
        print(' '.join(str(x) for x in line))

if __name__ == "__main__":
    main()