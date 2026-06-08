def main():
    scn = input().split()
    n = int(scn[0])
    arr = list(map(int, scn[1:]))
    ans = arr[0] + 1
    for i in range(1, len(arr)):
        ans += abs(arr[i] - arr[i-1]) + 2
    print(ans)

if __name__ == "__main__":
    main()