import sys

BIG_NUM = 2000000000
MOD = 1000000007

while True:
    try:
        inputed = input()
        if len(inputed) == 1 and inputed == "0":
            break
        ans = 0
        for i in range(len(inputed)):
            ans += int(inputed[i]) - 48
        print(ans)
    except Exception as e:
        print(e)