#!/usr/bin/env python3

def main():
    sc = Scanner()
    A1 = sc.nextInt()
    A2 = sc.nextInt()
    A3 = sc.nextInt()
    
    if (A1 + A2 + A3) >= 22:
        print("bust")
    else:
        print("win")

if __name__ == "__main__":
    main()

class Scanner:
    def __init__(self):
        self.input = input().split()
        self.index = 0
    
    def nextInt(self):
        result = int(self.input[self.index])
        self.index += 1
        return result