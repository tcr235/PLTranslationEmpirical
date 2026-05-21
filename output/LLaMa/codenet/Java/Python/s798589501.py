import sys

def read_int():
    return int(input())

def compute_year(E, Y):
    if E == 0:
        if Y <= 1911:
            return f"M{Y - 1867}"
        elif Y <= 1925:
            return f"T{Y - 1911}"
        elif Y <= 1988:
            return f"S{Y - 1925}"
        else:
            return f"H{Y - 1988}"
    elif E == 1:
        return 1867 + Y
    elif E == 2:
        return 1911 + Y
    elif E == 3:
        return 1925 + Y
    else:
        return 1988 + Y

def main():
    E = read_int()
    Y = read_int()
    result = compute_year(E, Y)
    print(result)

if __name__ == "__main__":
    main()