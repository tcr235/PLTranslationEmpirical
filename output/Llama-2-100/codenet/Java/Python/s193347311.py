import sys

def main():
    scan = sys.stdin.readline
    intLoop = int(scan())
    strTaro = ""
    strHana = ""
    intTaro = 0
    intHana = 0

    for i in range(intLoop):
        strTaro = scan().strip()
        strHana = scan().strip()
        intJudge = strTaro.compare(strHana)
        if intJudge < 0:
            intHana += 3
        elif intJudge == 0:
            intTaro += 1
            intHana += 1
        else:
            intTaro += 3

    print(intTaro, intHana)

main()
