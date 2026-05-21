import sys

def main():
    n = int(input())
    hm = {}
    for _ in range(n):
        val = int(input())
        hm[val] = hm.get(val, 0) + 1
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