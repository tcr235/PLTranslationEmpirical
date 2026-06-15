def main():
    n = int(input())
    str = [input() for _ in range(n)]
    mark = ["S", "H", "C", "D"]
    for ma in mark:
        for i in range(1, 14):
            st = ma + " " + str(i)
            if st in str:
                continue
            print(st)

main()
