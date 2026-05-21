import sys

n = int(input())
c = []
s = []
f = []

for _ in range(n - 1):
    c.append(int(input()))
    s.append(int(input()))
    f.append(int(input()))

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