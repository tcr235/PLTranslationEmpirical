def read():
    number = int(input())
    if number == 0:
        return False
    score = [int(input()) for _ in range(number)]
    return True

def slove():
    score = sorted(score)
    sum = 0
    for i in range(1, len(score)-1):
        sum = sum + score[i]
    print(sum/(len(score)-2))

main()
