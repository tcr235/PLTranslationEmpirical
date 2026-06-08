n = int(input())
c = []
s = []
f = []

for _ in range(n - 1):
    values = list(map(int, input().split()))
    c.append(values[0])
    s.append(values[1])
    f.append(values[2])

for i in range(n - 1):
    time = s[i] + c[i]
    for j in range(i + 1, n - 1):
        if time % f[j] != 0:
            time += f[j] - (time % f[j])
        if time < s[j]:
            time = s[j]
        time += c[j]
    print(time)
print(0)