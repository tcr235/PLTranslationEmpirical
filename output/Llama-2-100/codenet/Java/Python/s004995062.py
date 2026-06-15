import decimal

def main():
    sc = input()
    sa = sc.next()
    sb = sc.next()
    A = decimal.Decimal(sa)
    B = decimal.Decimal(sb)
    print(A * B).quantize(decimal.Decimal('0.00'))

