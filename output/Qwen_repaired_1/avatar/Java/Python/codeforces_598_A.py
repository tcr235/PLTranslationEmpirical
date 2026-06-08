import math

def calculate_s(n):
    x = math.ceil(math.log(n) / math.log(2))
    return -2 ** x + 2 + (n * (n + 1)) // 2 - 2 ** x

def codeforces_598_A():
    q = int(input())
    results = []
    for _ in range(q):
        n = int(input())
        results.append(str(calculate_s(n)))
    print('\n'.join(results))

if __name__ == "__main__":
    codeforces_598_A()