import sys

def main():
    n = int(input())
    array = []
    cnt = 1

    for _ in range(n):
        array.append(input())

    array.sort()

    a = array[0]
    for i in range(1, len(array)):
        if a != array[i]:
            cnt += 1
            a = array[i]

    print(cnt)

if __name__ == "__main__":
    main()