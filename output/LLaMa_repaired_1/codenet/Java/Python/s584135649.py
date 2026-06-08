n = 0
scanner = input("Enter numbers separated by space (or leave blank if 0): ")
numbers = scanner.split()
i = 0
for n in numbers:
    if n == '0':
        break
    i += 1

print(i)