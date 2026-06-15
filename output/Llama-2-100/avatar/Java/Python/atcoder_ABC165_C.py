def dfs(list):
    if len(list) == n:
        score = 0
        for i in range(q):
            score += (list[b[i]] - list[a[i]] == c[i]) ? d[i] : 0
        ans = max(ans, score)
        return
    if list:
        for num in range(1, m+1):
            list.append(num)
            dfs(list)
            list.pop()
    else:
        for num in range(1, m+1):
            list.append(num)
            dfs(list)
            list.pop()

n = int(input())
m = int(input())
q = int(input())
a = [int(input()) - 1 for _ in range(q)]
b = [int(input()) - 1 for _ in range(q)]
c = [int(input()) for _ in range(q)]
d = [int(input()) for _ in range(q)]
ans = -100

dfs([])
print(ans)
