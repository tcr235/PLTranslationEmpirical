def main():
    n = int(input())
    m = int(input())

    map = {}

    countAc = 0
    countWaAll = 0

    for i in range(m):
        question = int(input())
        waOrAc = input()

        if question not in map:
            if waOrAc == "WA":
                map[question] = 1
            else:
                map[question] = -1
                countAc += 1

        else:
            countWa = map[question]
            if countWa < 0:
                map[question] += 1
                countWaAll += countWa
            else:
                map[question] -= 1
                countAc += 1

    print(countAc, countWaAll)

main()
