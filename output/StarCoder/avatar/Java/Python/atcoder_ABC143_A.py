if __name__ == "__main__":
    try:
        input_values = input().strip().split(" ")
        a = int(input_values[0])
        b = int(input_values[1])
        c = max(a - b * 2, 0)
        print(c)
    except Exception as e:
        pass