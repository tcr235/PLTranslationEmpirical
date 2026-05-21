import re

def main():
    S = input()
    for i in range(len(S) + 1):
        for j in range(len(S) + 1):
            begin = S[:i]
            end = S[j:]
            answer = begin + end
            if answer == "keyence":
                print("YES")
                return
            elif begin == "keyence":
                print("YES")
                return
            elif end == "keyence":
                print("YES")
                return
    print("NO")

main()