import stdio
import math

def codeforces_58_B():
    n = int(std.input())
    print(n + " ")
    m = n
    for i in range(n-1, -1, -1):
        if m % i == 0:
            print(i + " ")
            m = i

