import input

def main():
    n = input.nextInt()
    if n % 10 == 9 || n / 10 == 9:
        print("Yes")
    else:
        print("No")

