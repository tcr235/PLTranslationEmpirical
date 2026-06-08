INF = 1e15
number = input()
digits = [int(number[-i-1]) for i in range(len(number)) if -i-1 < len(number)]
bills = 0

for i in range(len(digits)):
    if digits[i] == 10:
        if i < len(digits) - 1:
            digits[i+1] += 1
        else:
            digits.append(1)
        digits[i] = 0
    if i < len(digits) - 1:
        if digits[i] < 5:
            bills += digits[i]
        elif digits[i] == 5:
            if digits[i+1] >= 5:
                digits[i+1] += 1
            bills += 5
        else:
            digits[i+1] += 1
            bills += 10 - digits[i]

if digits[-1] != 0:
    bills += digits[-1]

print(bills)