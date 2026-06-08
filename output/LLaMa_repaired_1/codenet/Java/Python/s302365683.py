def main():
    with open(0, 'r') as f:
        s = f.readline().split()
        n = int(s[0])
        hm = {}
        for _ in range(n):
            s = f.readline().split()
            for val in s:
                hm[int(val)] = hm.get(int(val), 0) + 1
        ans = 0
        for val in hm:
            num = hm[val]
            if num > val:
                ans += num - val
            else:
                ans += num
        print(ans)

if __name__ == "__main__":
    main()