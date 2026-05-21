import sys

def calculate_time():
    h1 = int(input())
    m1 = int(input())
    h2 = int(input())
    m2 = int(input())
    k = int(input())
    t1 = h1 * 60 + m1
    t2 = h2 * 60 + m2
    return t2 - t1 - k

print(calculate_time())