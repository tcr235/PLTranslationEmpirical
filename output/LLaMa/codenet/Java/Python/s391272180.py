def rotate(str):
    str = list(str)
    char_t = str[0]
    for i in range(len(str) - 1):
        str[i] = str[i + 1]
    str[-1] = char_t
    return ''.join(str)


s = input()
t = input()
flag = False
for _ in range(len(s)):
    s = rotate(s)
    if t == s:
        flag = True
        break
print("Yes" if flag else "No")