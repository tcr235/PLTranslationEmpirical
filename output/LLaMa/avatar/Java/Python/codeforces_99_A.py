import sys

input_str = input()
str_lst = list(input_str)
dotIndex = 0

for i in range(len(str_lst)):
    if str_lst[i] == '.':
        dotIndex = i
        break

if str_lst[dotIndex - 1] == '9':
    print("GOTO Vasilisa.")
else:
    next_str = str_lst[dotIndex + 1]
    if int(next_str) > 4:
        _str = input_str[:dotIndex]
        print(int(_str) + 1)
    else:
        for i in range(dotIndex):
            print(str_lst[i], end='')
        print()