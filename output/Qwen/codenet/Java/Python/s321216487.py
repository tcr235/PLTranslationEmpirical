def main():
    s = input().strip()
    
    for i in range(len(s)):
        for j in range(i + 1, len(s) + 1):
            begin = s[:i]
            end = s[j:]
            answer = begin + end
            
            if answer == "keyence":
                print("YES")
                return
            elif begin == "keyence" or end == "keyence":
                print("YES")
                return
    
    print("NO")

if __name__ == "__main__":
    main()