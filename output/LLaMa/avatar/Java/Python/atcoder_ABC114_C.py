import sys

def gs():
    return input()

def gi():
    return int(input())

def gl():
    return int(input())

def gd():
    return float(input())

N = gi()
i = 357
c = 0
while i <= N:
    s = str(i)
    if '3' in s and '5' in s and '7' in s:
        c += 1
        sb = []
        f = False
        for j in range(len(s)):
            a = s[-1-j]
            if f:
                sb.append(a)
            else:
                if a == '3':
                    sb.append('5')
                    f = True
                elif a == '5':
                    sb.append('7')
                    f = True
                else:
                    sb.append('3')
        if not f:
            sb.append('3')
        sb = sb[::-1]
        i = int(''.join(sb))
    else:
        i += 1

print(c)