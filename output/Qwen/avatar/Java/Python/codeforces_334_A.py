import sys

def main():
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    square = n * n
    odd = [i for i in range(1, square + 1) if i % 2 != 0]
    even = [i for i in range(1, square + 1) if i % 2 == 0]
    
    loop = square // n
    div = loop // 2
    
    def debug(*obj):
        print(obj, file=sys.stderr)
    
    debug(div)
    
    for i in range(loop):
        for _ in range(div):
            if i % 2 == 1:
                print(odd.pop(0), even.pop(), end=" ")
            else:
                print(even.pop(0), odd.pop(), end=" ")
        print()

if __name__ == '__main__':
    sys.exit(main())