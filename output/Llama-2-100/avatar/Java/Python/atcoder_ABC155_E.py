def atcoder_ABC155_E(number):
    INF = 1e15
    sc = input()
    digits = [0] * (len(number) + 1)
    for i in range(len(number)):
        digits[i] = ord(number[len(number) - 1 - i]) - ord('0')
    bills = 0
    for i in range(len(number)):
        if digits[i] == 10:
            digits[i + 1] += 1
            bills += 5
        elif digits[i] < 5:
            bills += digits[i]
        else:
            digits[i + 1] += 1
            bills += 10 - digits[i]
    print(bills)

