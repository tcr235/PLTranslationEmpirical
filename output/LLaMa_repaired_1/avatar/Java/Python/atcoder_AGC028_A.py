n, m = map(int, input().split())
gcd = n * m

s = input()
t = input()

result = next((k for k in range(gcd) if s[k*n//gcd] != t[k*m//gcd]), n*m//gcd)

print(result)