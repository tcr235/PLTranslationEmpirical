import sys

def main():
    arr = input()
    N = len(arr)
    K = int(input())
    res = 0
    for _ in range(K):
        input_str = input()
        a, b = 0, 0
        temp = 0
        for i in range(N):
            if arr[i] == input_str[0]:
                a += 1
            elif arr[i] == input_str[1]:
                b += 1
            else:
                temp += min(a, b)
                a, b = 0, 0
        temp += min(a, b)
        res += temp
    print(res)

if __name__ == "__main__":
    main()