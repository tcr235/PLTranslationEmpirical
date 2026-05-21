from typing import List

def main():
    n, m, q = map(int, input().split())
    a = [int(input()) - 1 for _ in range(q)]
    b = [int(input()) - 1 for _ in range(q)]
    c = [int(input()) for _ in range(q)]
    d = [int(input()) for _ in range(q)]

    ans = -100

    def dfs(list: List[int]) -> None:
        nonlocal ans
        if len(list) == n:
            score = sum((list[b[i]] - list[a[i]] == c[i]) * d[i] for i in range(q))
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