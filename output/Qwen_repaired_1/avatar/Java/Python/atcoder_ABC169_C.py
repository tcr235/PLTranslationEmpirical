def atcoder_ABC169_C(a, b):
    b_str = ''.join(char for char in b.split()[1] if char != '.')
    b_int = int(b_str)
    result = (int(a) * b_int) // 100
    return result

# Example usage:
if __name__ == "__main__":
    a = float(input("Enter a value for a: "))
    b = float(input("Enter a value for b: "))
    print(atcoder_ABC169_C(a, str(b)))