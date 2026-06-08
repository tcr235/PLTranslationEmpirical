import math
q = int(input())
for _ in range(q):
    n = int(input())
    x = math.ceil(math.log2(n))
    s = -1 * (n + 1) - (2**x) * (math.ceil((n + 1) / (2**x)) - 1)  + (n * (n + 1)) // 2 - (2**x) + 1
    print(s)