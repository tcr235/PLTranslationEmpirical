def check_digit(num):
    return '3' in num and '5' in num and '7' in num

def transform(num):
    digits = list(str(num))
    reverse_digits = []
    swap = False
    
    for digit in reversed(digits):
        if swap:
            reverse_digits.append(digit)
        elif digit == '3':
            reverse_digits.append('5')
            swap = True
        elif digit == '5':
            reverse_digits.append('7')
            swap = True
        else:
            reverse_digits.append('3')
    
    if not swap:
        reverse_digits.append('3')
    
    return int(''.join(reverse_digits[::-1]))

N = int(input())
count = 0
i = 357

while i <= N:
    if check_digit(str(i)):
        count += 1
    
    i = transform(i)

print(count)