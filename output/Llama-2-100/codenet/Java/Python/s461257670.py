def main():

    sc = input()
    count = int(sc)

    for i in range(count):
        y = int(sc.next())
        m = int(sc.next())
        d = int(sc.next())

        print(Answer(y, m, d))

def Answer(y, m, d):

    result = 1

    if y % 3 == 0:
        result += 20 - d
    elif m % 2 == 0:
        result += 19 - d
    else:
        result += 20 - d

    for m in range(1, 11):
        if y % 3 == 0:
            result += 20
        else:
            if m % 2 == 0:
                result += 19
            else:
                result += 20

    for y in range(1, 1000):
        if y % 3 == 0:
            result += 200
        else:
            result += 195

    return result

