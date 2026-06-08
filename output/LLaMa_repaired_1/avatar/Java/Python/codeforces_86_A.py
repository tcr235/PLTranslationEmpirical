def power(a):
    count = 0
    while a > 0:
        a = a // 10
        count += 1
    return count

def mult(a):
    pow = power(a)
    max_val = 0
    for _ in range(pow):
        max_val = max_val * 10 + 9
    return a * (max_val - a)

def get_values(l, r):
    maxxes = []
    temp = 0
    for _ in range(10):
        temp = temp * 10 + 9
        maxxes.append(temp // 2 * (temp - temp // 2))
    
    res = max(mult(l), mult(r))
    
    for _ in range(10):
        temp = temp * 10 + 9
        if l <= temp // 2 and temp // 2 <= r:
            res = max(maxxes[-1], res)
        if l <= temp and temp <= r:
            res = max(temp // 2 * (temp - temp // 2), res)
        maxxes.append(temp // 2 * (temp - temp // 2))
    
    return res, maxxes

l = list(map(int, input().split()))
r = list(map(int, input().split()))

print(get_values(l[0], l[1])[0])