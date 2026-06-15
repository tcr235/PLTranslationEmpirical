import input

def main():

sc = input.scanner()
n = long(sc.next())

sqrt = math.sqrt(n)
nearNum = int(sqrt)

ans = long(math.pow(nearNum, 2))

print(ans)

input.close()
