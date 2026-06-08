while True:
    try:
        str = input()
        strArr = str.split(",")
        if len(strArr) < 12:
            print("Input must contain 12 values.")
            continue
        l = [int(i) for i in strArr[:10]]
        v = [int(strArr[10]), int(strArr[11])]
        d = sum(l)
        t = d / sum(v)
        for i in range(10):
            d += l[i]
            if v[0] * t <= d:
                print(i)
                break
    except (IndexError, ValueError):
        print("Invalid input. Please enter 10 integers and 2 more integers separated by commas.")