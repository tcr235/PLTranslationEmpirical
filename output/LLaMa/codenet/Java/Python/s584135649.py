n = 0
while n != 5:
    n = int(input("Enter a number (or 0 to exit): "))
    if n == 0:
        break

print("Loop ended after", n, "iterations")