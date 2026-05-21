import sys

def atcoder_ABC153_A():
    h = int(input().split()[0])
    a = int(input().split()[1])
    num = 0
    for i in range(1, h + 1):
        h = h - a
        num += 1
    return num

print(atcoder_ABC153_A())