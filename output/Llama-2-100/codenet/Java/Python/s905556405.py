import sys

def main():
    numlist = [int(x) for x in sys.stdin.readline().split()]
    k = int(sys.stdin.readline())
    if (numlist[4] - numlist[0]) > k:
        print(":(")
    else:
        print("Yay!")

main()
