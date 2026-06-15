def codeforces_302_A(n, k): Scanner = input Scanner n = int(n) k = int(k) arr = [int(i) for i in range(n)] o = 0 e = 0 for i in range(n): if arr[i] == 1: o += 1 else: e += 1 for i in range(k): l = int(input()) r = int(input()) if (r - l + 1) % 2 == 1: print("0\n") else: if (r - l + 1) // 2 <= o and (r - l + 1) // 2 <= e: print("1\n") else: print("0\n")

