while True:
    a = input().split()
    if a[0] == '?':
        break
    else:
        a = list(map(int, a[:-1]))
        op = a[-1]
        b = int(input())
        if op == '+':
            print(a[0] + b)
        elif op == '-':
            print(a[0] - b)
        elif op == '*':
            print(a[0] * b)
        elif op == '/':
            print(int(a[0] / b))