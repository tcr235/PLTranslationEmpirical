import sys

def debug(obj):
    print(obj)

def read_list():
    n = int(input())
    lst = list(map(int, input().split()))
    lst.sort()
    return lst

def solution(n, arr):
    c = 1
    for i in range(n):
        if arr[i] >= c:
            c += 1
    return c

def main():
    n = int(input())
    list_ = read_list()
    ans = solution(n, list_)
    print(ans)

if __name__ == "__main__":
    sys.stderr = open("log.txt", "w")
    main()