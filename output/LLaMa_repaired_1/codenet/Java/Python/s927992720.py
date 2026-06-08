import sys

if __name__ == "__main__":
    while True:
        try:
            a = int(input())
            op = input()
            b = int(input())
            
            if op == "?":
                break
            elif op == "+":
                print(a + b)
            elif op == "-":
                print(a - b)
            elif op == "*":
                print(a * b)
            elif op == "/":
                print(a / b)
        except ValueError:
            print("Invalid input. Please enter numbers and operators.")
        except ZeroDivisionError:
            print("Cannot divide by zero.")