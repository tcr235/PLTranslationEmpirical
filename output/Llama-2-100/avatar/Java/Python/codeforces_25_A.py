def codeforces_25_A ( n ): # n is the number of test cases to be read from the input Scanner sc = input ( ) scanned_array = [ int ( sc.next ( )) for _ in range ( n + 1 ) ] odd = 0 even = 0 odd_ind = 0 even_ind = 0 for i in range ( 1, n + 1 ): if scanned_array [ i ] % 2 == 0 : even += 1 even_ind = i odd += 1 odd_ind = i if odd > even : print ( even_ind ) else : print ( odd_ind )

