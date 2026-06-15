import sys

n = int(raw_input().strip())
s = ".,!? :abc:def:ghi:jkl:mno:pqrs:tuv:wxyz".split(":")
k = []
for i in range(9):
    k.append(s[i].split(""))
while n > 0:
    c = raw_input().strip()
    l = -1
    a = 0
    for i in range(len(c)):
        if c[i]!= '0':
            a = ord(c[i]) - ord('1')
            l = (l + 1) % len(k[a])
        else:
            if l >= 0:
                print k[a][l]
                l = -1
    print
    n -= 1

