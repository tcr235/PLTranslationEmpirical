def main():
    size = int(input())
    graph = [[0 for _ in range(size)] for _ in range(size)]
    
    for i in range(size):
        id_val = int(input().split()[0]) - 1
        cols = int(input().split()[0])
        row = [0 for _ in range(size)]
        for j in range(1, cols + 1):
            row[int(input().split()[j - 1]) - 1] = 1
        graph[id_val] = row
    
    for row in graph:
        print(' '.join(map(str, row)))

if __name__ == "__main__":
    main()