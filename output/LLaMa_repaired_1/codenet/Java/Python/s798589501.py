def read_int_list():
    return list(map(int, input().split()))

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
    elif E == 4:
        return 1988 + Y
    elif E >= 5:
        return E + Y

def main():
    E, Y = read_int_list()
    result = compute_year(E, Y)
    print(result)

if __name__ == "__main__":
    main()