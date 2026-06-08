import sys

A = int(input())
B = int(input())
amari = 0
result = 0
result = (B - 1) // (A - 1)
amari = (B - 1) % (A - 1)
if(amari != 0):
    result += 1
out = sys.stdout
out.write(str(result) + "\n")
out.flush()