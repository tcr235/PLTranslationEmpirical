def power(a: int) -> int:
    res = -1
    while a > 0:
        a /= 10
        res += 1
    return res

def mult(a: int) -> int:
    pow_a = power(a)
    max_val = 0
    for _ in range(pow_a):
        max_val *= 10
        max_val += 9
    return int(a * (max_val - a))

def main():
    l = int(input())
    r = int(input())
    res = 0
    maxxes = [0] * 10
    temp = 0
    
    for i in range(10):
        temp *= 10
        temp += 9
        maxxes[i] = int(temp // 2 * (temp - temp // 2))
    
    res = max(mult(l), res)
    res = max(mult(r), res)
    temp = 0
    
    for i in range(10):
        temp *= 10
        temp += 9
        if l <= temp // 2 <= r:
            res = max(maxxes[i], res)

    print(res)

main()