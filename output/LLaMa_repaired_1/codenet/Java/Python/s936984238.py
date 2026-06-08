def read():
    number = int(input())
    if number == 0:
        return False
    score = []
    for _ in range(number):
        score.append(int(input()))
    return score

def slove(score):
    score.sort()
    sum = sum(score[1:-1])
    print(sum/(len(score)-2))

while True:
    if not score := read():
        break
    slove(score)