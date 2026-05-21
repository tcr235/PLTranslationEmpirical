import sys

loop = int(input())
taro = 0
hana = 0

for i in range(loop):
    taro_str = input()
    hana_str = input()
    judge = taro_str.casefold() > hana_str.casefold()
    if judge:
        hana += 3
    elif taro_str.casefold() == hana_str.casefold():
        taro += 1
        hana += 1
    else:
        taro += 3

print(taro, hana)