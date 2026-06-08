n = input("Enter 10 numbers (separated by space): ")
n = list(map(int, n.split()))
Num = [i for i in n]
for a in range(9, -1, -1):
    for b in range(a):
        if Num[b] > Num[b+1]:
            Num[b], Num[b+1] = Num[b+1], Num[b]

print(Num[0])
print(Num[1])
print(Num[2])