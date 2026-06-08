from decimal import Decimal

sa = input("Enter first number: ")
sb = input("Enter second number: ")

A = Decimal(sa)
B = Decimal(sb)
result = A * B
rounded_result = result.quantize(Decimal('1'), rounding=ROUND_FLOOR)

print(rounded_result)