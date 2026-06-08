k = input()
k = int(k.split()[0])
a = int(input().split()[0])
b = int(input().split()[0])

if b <= a + 2:
    print(1 + k)
else:
    x = k - (a - 1)
    ans = a + (x // 2) * (b - a) + (x % 2)
    print(ans)