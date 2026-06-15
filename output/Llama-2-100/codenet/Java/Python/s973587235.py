import sys

def main():
    sc = input()
    n = int(sc)
    min_n = int(sc) - 1
    for i in range(n - 1):
        h = int(sc)
        if min_n == h:
            min_n = h
        elif min_n == h - 1:
            min_n = h - 1
        elif min_n < h - 1:
            min_n = h - 1
        elif min_n > h:
            print("No")
            return
    print("Yes")

