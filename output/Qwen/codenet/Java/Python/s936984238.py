import sys

def read():
    global score, number
    number = int(sys.stdin.readline().strip())
    if number == 0:
        return False
    score = list(map(int, sys.stdin.readline().split()))
    return True

while read():
    slope()
    
def solve():
    score.sort()
    total_sum = sum(score[1:-1])
    print(total_sum // (len(score) - 2))