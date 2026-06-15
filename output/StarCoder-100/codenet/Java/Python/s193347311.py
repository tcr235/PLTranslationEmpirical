import sys

for line in sys.stdin:
    line = line.strip()
    if line == "":
        break
    a, b = line.split()
    a = int(a)
    b = int(b)
    if a < b:
        print("3 " + str(a + b))
    elif a == b:
        print("1 1")
    else:
        print("0 " + str(a + b))

