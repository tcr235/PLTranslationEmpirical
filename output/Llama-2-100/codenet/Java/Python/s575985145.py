import sys

def main():
    size = int(sys.stdin.readline().strip())
    graph = [[0] * size for _ in range(size)]
    
    id = 0
    cols = 0
    row = [0] * size
    for _ in range(size):
        id = int(sys.stdin.readline().strip())
        cols = int(sys.stdin.readline().strip())
        for _ in range(cols):
            row[int(sys.stdin.readline().strip()) - 1] = 1
        graph[id - 1] = row
    
    for row in graph:
        print(" ".join(str(x) for x in row))

if __name__ == "__main__":
    main()


