def main():
    a = int(input("Enter the first number: "))
    b = int(input("Enter the second number: "))
    c = int(input("Enter the third number: "))
    
    if a < b and b < c and a < c:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()