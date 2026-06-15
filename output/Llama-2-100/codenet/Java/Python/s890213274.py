import input

def main():
    A1 = input.nextInt()
    A2 = input.nextInt()
    A3 = input.nextInt()
    
    if (A1+A2+A3) >= 22:
        print("bust")
    else:
        print("win")
