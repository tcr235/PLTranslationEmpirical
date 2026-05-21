from decimal import Decimal
import math

def main():
    sa = input()
    sb = input()
    A = Decimal(sa)
    B = Decimal(sb)
    print((A * B).to_integral_value())

main()