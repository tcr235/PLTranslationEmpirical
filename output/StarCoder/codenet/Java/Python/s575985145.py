def main():
    size = int(input())
    graph = [[0 for _ in range(size)] for _ in range(size)]
    
    for i in range(size):
        id_val = int(input()) - 1
        cols = int(input())
        row = [0 for _ in range(size)]
        for j in range(cols):
            row[int(input()) - 1] = 1
        graph[id_val] = row
    
    for row in graph:
        print(' '.join(map(str, row)))

if __name__ == "__main__":
    main()