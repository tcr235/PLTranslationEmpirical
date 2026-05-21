import sys

sc = open("input.txt", "r")
sc = sc.read().split()
A = int(sc[0])
B = int(sc[1])
amari = 0
result = 0
result = (B - 1) // (A - 1)
amari = (B - 1) % (A - 1)
if(amari != 0):
    result += 1
out = sys.stdout
out.write(str(result) + "\n")
out.close()