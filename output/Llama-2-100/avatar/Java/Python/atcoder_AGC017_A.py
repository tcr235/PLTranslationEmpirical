def C(n, m):
 BigInteger res = BigInteger('1')
 for i in range(m - n + 1, m):
 res = res * BigInteger(i)
 for i in range(1, n):
 res = res / BigInteger(i)
 return res

def main():
 n = int(input())
 p = int(input())
 k0 = 0
 k1 = 0
 for _ in range(n):
 x = int(input())
 if x % 2 == 1:
 k1 += 1
 else:
 k0 += 1
 ans = BigInteger('1')
 for _ in range(k0):
 ans = ans * BigInteger(2)
 if p == 0:
 for _ in range(k1):
 ans = ans * C(0, k1)
 print(ans)
 else:
 for _ in range(k1, 0, -2):
 ans = ans * C(1, k1)
 print(ans)

main()

Expected Output:

1
2
4
8
16
32
64
128
256
512
1024
2048
4096
8192
16384
32768
