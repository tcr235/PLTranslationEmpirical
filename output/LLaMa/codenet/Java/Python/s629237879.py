import sys

n = input()
n = int(n)
str_cards = []
for _ in range(n):
    str_cards.append(input())

marks = ["S", "H", "C", "D"]
for mark in marks:
    for i in range(1, 14):
        st = mark + " " + str(i)
        if st not in str_cards:
            print(st)