import re

def main():
    n = int(input())
    num = list(range(1, n + 1))
    
    count = int(input())
    pt = re.compile(r"(\d+),(\d+)")
    
    for _ in range(count):
        next_line = input()
        line = [int(x) - 1 for x in pt.findall(next_line)[0]]
        change = num[line[0]]
        num[line[0]] = num[line[1]]
        num[line[1]] = change
    
    for i in num:
        print(i)

if __name__ == "__main__":
    main()