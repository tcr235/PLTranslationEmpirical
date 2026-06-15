def codeforces_11_A ( n , d ): Scanner = input ( ) int nums = [ int ( ) for _ in range ( n ) ] for i in range ( n ): nums [ i ] = input ( ) int result = 0 for i in range ( 1 , n - 1 ): if ( nums [ i - 1 ] - nums [ i ] ) >= 0 : result += ( nums [ i - 1 ] - nums [ i ] ) // d + 1 nums [ i ] += ( nums [ i - 1 ] - nums [ i ] ) // d + 1 * d print ( result )

