def split(n, k):
    sum_ = 0
    while n > 0:
        sum_ += n % k
        n //= k
    return sum_

def solve(n, s):
    k = 2
    while k*k <= n or k < 100:
        if split(n, k) == s:
            return k
        k += 1
    
    while k <= n:
        a, b = divmod(n, k)
        if (a + b - s) % a == 0:
            dk = (a + b - s) // a
            if dk >= 0 and b - dk*a >= 0:
                return k + dk
        k = n // a + 1
    
    if n == s:
        return n + 1
    return -1

if __name__ == "__main__":
    import sys
    input stdin = sys.stdin
    nl = int(input().strip())
    sl = int(input().strip())
    print(solve(nl, sl))