import sys
import decimal

a = sys.stdin.readline()
b = sys.stdin.readline()

A = decimal.Decimal(a)
B = decimal.Decimal(b)

print(int(A * B))

