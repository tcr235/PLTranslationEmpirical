from typing import List

def main():
    n, m, q = map(int, input().split())
    a = []
    b = []
    c = []
    d = []

    for _ in range(q):
        inputs = list(map(int, input().split()))
        a.append(inputs[0] - 1)
        b.append(inputs[1] - 1)
        c.append(inputs[2])
        d.append(inputs[3])

    ans = -100

    def dfs(list: List[int]) -> None:
        nonlocal ans
        if len(list) == n:
            score = sum(((b[i] in list) and (a[i] in list) and (list.index(b[i]) - list.index(a[i]) == c[i])) and d[i] or 0 for i in range(q))
            ans = max(ans, score)
            return
        if list:
            for num in range(list[-1], m + 1):
                list.append(num)
                dfs(list)
                list.pop()
        else:
            for num in range(1, m + 1):
                list.append(num)
                dfs(list)
                list.pop()

    dfs([])
    print(ans)

if __name__ == "__main__":
    main()