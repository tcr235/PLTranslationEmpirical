def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    index = 0
    while index < len(data):
        str_list = [data[index + i] for i in range(11)]
        l = [int(x) for x in str_list[:10]]
        d = sum(l)
        v = [int(val) for val in str_list[10:]]
        
        t = d / (v[0] + v[1])
        d = 0
        for i, x in enumerate(l):
            d += x
            if v[0] * t <= d:
                print(i + 11)
                break

if __name__ == "__main__":
    main()