import sys

def main():
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    numbers = [int(data[i + 1]) for i in range(n)]
    
    numbers.sort()
    count = 1
    
    for num in numbers:
        if num >= count:
            count += 1
    
    print(count)

if __name__ == "__main__":
    main()