INF = 10**15
number = input()
digits = list(map(int, reversed(number)))
bills = 0

for i in range(len(digits)):
    if digits[i] == 10:
        digits.append(1)
        digits[i] = 0
    
    if digits[i] < 5:
        bills += digits[i]
    elif digits[i] == 5:
        if digits[i+1] >= 5:
            digits.append(1)
        bills += 5
    else:
        digits.append(1)
        bills += 10 - digits[i]

print(bills)