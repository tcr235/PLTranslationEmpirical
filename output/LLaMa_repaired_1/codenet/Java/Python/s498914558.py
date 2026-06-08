input_list = input().split()
n, m = map(int, input_list[:-2])
po = list(map(int, input_list[-2:]))

while m > 0:
    for i in range(len(po)):
        if m >= po[i]:
            m -= po[i]
            del po[i]
            break

po.sort()
print(n + m // po[0] if po != [] else n)