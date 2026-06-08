INF = 10**15
number = input()
digits = list(map(int, reversed(number)))
bills = 0

for i in range(len(digits) - 1):
    if digits[i] == 10:
        digits[i + 1] += 1
        digits[i] = 0
        
    if digits[i] < 5:
        bills += digits[i]
    elif digits[i] == 5:
        if digits[i+1] >= 5:
            digits[i+1] += 1
        bills += 5
    else:
        bills += 10 - digits[i]

if digits[-1] > 0:
    bills += digits[-1]

print(bills)