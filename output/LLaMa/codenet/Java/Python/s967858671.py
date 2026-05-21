Num = [0]*11
n = input("Enter 10 numbers (separated by space): ")
n = list(map(int, n.split()))
for i in range(9):
    for j in range(9-i):
        if n[j] > n[j+1]:
            n[j], n[j+1] = n[j+1], n[j]

print(n[0])
print(n[1])
print(n[2])