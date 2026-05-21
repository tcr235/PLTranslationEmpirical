N = int(input())
s = input().strip()
ans = 0
hen = 0
sha = 0
dot = 0
first = True

for char in s:
    if char == '#':
        if not first and sha <= dot:
            ans += sha
            sha = 0
            dot = 0
            first = True
        else:
            sha += 1
    else:
        if first == False:
            dot += 1
first = True

if sha <= dot:
    ans += sha
print(ans + dot)