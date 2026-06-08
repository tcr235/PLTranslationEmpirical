import sys

def debug(obj):
    print(str(obj), file=sys.stderr)

def main():
    n = int(input())
    square = n * n
    odd = []
    even = []
    for i in range(1, square + 1):
        if i % 2 == 0:
            even.append(i)
        else:
            odd.append(i)
    loop = square // n
    div = loop // 2
    debug(div)
    dw = loop // 2; ud = odd[:dw]  # No need for pointer here, just get the slice
    uw, ud = ud, odd[:dw]  # Swap elements
    for i in range(loop):
        for j in range(div):
            if i % 2 == 1:
                print(odd.pop(0), even[i % dw + 1] if i < dw else uw.pop(), end=' ')
            else:
                print(even.pop(0), odd[i % dw + 1] if i < dw else ud.pop(), end=' ')
        print()

if __name__ == "__main__":
    main()