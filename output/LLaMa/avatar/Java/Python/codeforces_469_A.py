import sys

def main():
    n, levels = map(int, input().split())
    arr = list(map(int, input().split()))
    sum = 0
    sum2 = 0
    sum3 = 0
    count = 0
    arr2 = arr + list(map(int, input().split()))
    arr3 = list(range(1, n + 1))

    for i in range(n):
        for x in range(len(arr2)):
            if arr3[i] == arr2[x]:
                count += 1
                break

    if count == n:
        print("I become the guy.")
    else:
        print("Oh, my keyboard!")

if __name__ == "__main__":
    main()