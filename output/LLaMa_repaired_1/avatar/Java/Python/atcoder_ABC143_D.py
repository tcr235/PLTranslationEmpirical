from typing import List

def find(li: List[int], from_: int, target: int) -> int:
    low: int = from_
    upp: int = len(li) - 1
    mid: int = (upp - low + 1) // 2 if (upp - low + 1) % 2 == 0 else (upp - low + 2) // 2

    if upp - low < 0:
        return 0
    elif li[low] >= target:
        return 0
    elif li[upp] < target:
        return upp - low + 1

    while upp - low > 1:
        if li[mid] >= target:
            upp = mid
        else:
            low = mid
        mid = (upp - low + 1) // 2 if (upp - low + 1) % 2 == 0 else (upp - low + 2) // 2

    return low - from_ + 1


def main():
    input_values = input().split()
    N = int(input_values[0])
    L = []
    for value in input_values[1:N + 1]:
        L.append(int(value))

    L.sort()
    count = 0
    for i in range(N):
        for j in range(i + 1, N):
            a = L[i]
            b = L[j]
            res = find(L, j + 1, a + b)
            count += res

    print(count)


if __name__ == "__main__":
    main()