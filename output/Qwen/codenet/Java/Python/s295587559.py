import re

def main():
    n = int(input())
    num = list(range(1, n + 1))
    
    count = int(input())
    pt = re.compile(r"(\d+),(\d+)")
    
    for _ in range(count):
        next_line = input()
        line = list(map(int, pt.findall(next_line)[0])) - 1
        change = num[line[0]]
        num[line[0]] = num[line[1]]
        num[line[1]] = change
    
    for i in num:
        print(i)

if __name__ == "__main__":
    main()