import math

def codeforces_598_A():
    q = int(input())
    while q > 0:
        n = int(input())
        x = math.ceil(math.log(n) / math.log(2))
        s = -2 ** x + 2 + (n * (n + 1)) // 2 - 2 ** x
        print(s)
        q -= 1

codeforces_598_A()