n = int(input())
k = int(input())
n += 1
z = 0 if n % k == 0 else k - n % k
print(n + z)