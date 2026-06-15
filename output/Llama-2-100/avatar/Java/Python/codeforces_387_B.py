def codeforces_387_B ( n , m ): Scanner = input Scanner n = int ( input.next ( ) ) m = int ( input.next ( ) ) req = [ int ( input.next ( ) ) for _ in range ( n ) ] pre = [ int ( input.next ( ) ) for _ in range ( m ) ] i = n - 1 j = m - 1 ans = 0 while i >= 0 and j >= 0 : if req [ i ] > pre [ j ] : ans += 1 j -= 1 i -= 1 print ( ans + i + 1 )

