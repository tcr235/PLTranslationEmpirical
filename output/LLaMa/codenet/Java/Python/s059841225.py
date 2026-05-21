import math

l = []
v = []
d = 0

while True:
    try:
        str = input()
        strArr = str.split(",")
        for i in range(10):
            l.append(int(strArr[i]))
            d += int(strArr[i])
        v = [int(strArr[10]), int(strArr[11])]
        t = d / (v[0] + v[1])
        d = 0
        for i in range(11):
            if v[0] * t <= d:
                print(i)
                break
            else:
                d += l[i]
    except (IndexError, ValueError):
        break