def is_pythagorean_triangle(a, b, c):
    return a**2 + b**2 == c**2

def main():
    n = int(input())
    for _ in range(n):
        a, b, c = map(int, input().split())
        sides = [a, b, c]
        sides.sort()
        if is_pythagorean_triangle(sides[0], sides[1], sides[2]):
            print("YES")
        else:
            print("NO")

if __name__ == "__main__":
    main()