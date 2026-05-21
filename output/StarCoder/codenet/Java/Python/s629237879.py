import sys

input = sys.stdin.read
data = input().split()

n = int(data[0])
cards = data[1:]

mark = ["S", "H", "C", "D"]

for m in mark:
    for i in range(1, 14):
        card = f"{m} {i}"
        if card not in cards:
            print(card)