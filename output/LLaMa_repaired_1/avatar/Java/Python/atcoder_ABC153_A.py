import sys

def atcoder_ABC153_A():
    h = int(input())
    a = int(input())
    num = 0
    for i in range(1, h + 1):
        h = h - a
        if h <= 0:
            break
        num += 1
    return num

print(atcoder_ABC153_A())