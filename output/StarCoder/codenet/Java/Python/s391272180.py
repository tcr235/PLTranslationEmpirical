def rotate(s):
    return s[1:] + s[0]

s = input()
t = input()
flag = False

for _ in range(len(s)):
    if t == rotate(s):
        flag = True
        break
    s = rotate(s)

if flag:
    print("Yes")
else:
    print("No")