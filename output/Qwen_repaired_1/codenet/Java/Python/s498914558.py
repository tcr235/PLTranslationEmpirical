n = int(input().split()[0])
m = int(input().split()[1])
po = [int(input()) for _ in range(n)]
m -= sum(po)
po.sort()
print(n + m // po[0])