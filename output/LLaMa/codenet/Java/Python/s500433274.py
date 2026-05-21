import math

def check_numbers(a, b):
    if a > b:
        return "GREATER"
    elif b > a:
        return "LESS"
    else:
        return "EQUAL"

def main():
    while True:
        try:
            a = int(input())
            b = int(input())
            print(check_numbers(a, b))
        except ValueError:
            break

if __name__ == "__main__":
    main()