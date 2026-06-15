def codeforces_306_A ( n , m ):
    a = [0] * m
    if n % m == 0:
        for i in range(m):
            a[i] = n // m
    else:
        sub = n // m
        for i in range(m):
            a[i] = sub
        test = n - (sub * m)
        count = 0
        for i in range(test):
            a[count] = a[count] + 1
            count += 1
            if count > a.length:
                count = 0
        for i in range(a.length - 1, -1, -1):
            print(a[i] + " ")
    return a

