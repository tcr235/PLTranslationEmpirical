s = ",.!?:abc:def:ghi:jkl:mno:pqrs:tuv:wxyz"
k = s.split(":")
for i in range(len(k)):
    k[i] = k[i].replace(" ", "").split()

n = int(input())
while n > 0:
    input_str = input()
    a = []
    l = -1, 0
    temp = -1
    for char in input_str:
        if char != '0':
            a.append(k[int(char) - 1][len(a) % len(k[int(char) - 1])])
            temp = l[1] = (l[1] + 1) % len(k[int(char) - 1])
        else:
            if l[0] >= 0:
                print(k[l[1]][l[0]], end='')
                if temp < l[0]:
                    l = l[0], l[1] = l[0] + 1, temp
                else:
                    l = -1, l[1]
            else:
                print('', end='')
    if l[0] >= 0:
        print(k[l[1]][l[0]])
    print()
    n -= 1