def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    min_n = int(data[1]) - 1
    
    for i in range(2, 2 * n):
        h = int(data[i])
        
        if min_n == h:
            min_n = h
        elif min_n == h - 1:
            min_n = h - 1
        elif min_n < h - 1:
            min_n = h - 1
        else:
            print("No")
            return
    
    print("Yes")

main()