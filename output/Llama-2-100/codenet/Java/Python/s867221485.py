def main():
    N = int(input())
    s = input()
    flag = False
    ans = 0
    hen = 0
    sha = 0
    dot = 0
    temp = 0
    first = True
    for i in range(N):
        if s[i] == '#':
            if flag:
                ans += sha
                sha = 0
                dot = 0
                first = True
            else:
                sha++
        else:
            if first:
                dot++
            else:
                temp += dot
            first = False
    if sha <= dot:
        ans += sha
    else:
        ans += temp
    print(ans + dot)


