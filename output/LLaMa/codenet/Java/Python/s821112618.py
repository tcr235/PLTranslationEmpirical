s = ".,!? :abc:def:ghi:jkl:mno:pqrs:tuv:wxyz"
k = s.split(":")
for i in range(len(k)):
    k[i] = k[i].replace(" ", "").split()

input_str = input()
a = ""
for char in input_str:
    if char != '0':
        a += k[int(char) - 1][len(a) % len(k[int(char) - 1])]
    else:
        if a:
            a += k[int(a[-1]) - 1][len(a) % len(k[int(a[-1]) - 1])]

print(a)