def main():
    scanner = Scanner(sys.stdin)
    a = scanner.nextInt()
    b = scanner.nextInt()
    c = scanner.nextInt()
    scanner.close()
    
    if a < b and b < c and a < c:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()