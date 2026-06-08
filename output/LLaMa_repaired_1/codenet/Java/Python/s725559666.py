def main():
    input_str = input("Enter three numbers separated by spaces: ")
    numbers = list(map(int, input_str.split(' ')))
    
    if numbers[0] < numbers[1] and numbers[1] < numbers[2]:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()