import math
import input

def main():

a,b,c = input.nextBigInteger(), input.nextBigInteger(), max(a,b)

if a == c and not b == c:
    print("GREATER")
elif b == c and not a == c:
    print("LESS")
else:
    print("EQUAL")

input.close()
