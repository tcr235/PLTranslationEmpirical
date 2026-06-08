def main():
    n = int(input())
    s = ".,!? :abc:def:ghi:jkl:mno:pqrs:tuv:wxyz".split(":")
    k = [list(char) for char in s[:-1]]
    for _ in range(n):
        c = input()
        l = -1
        for i in range(len(c)):
            if c[i] != '0':
                a = int(c[i]) - 1
                l = (l + 1) % len(k[a])
            elif l >= 0:
                print(k[a][l], end='')
                l = -1
        print()

if __name__ == "__main__":
    main()