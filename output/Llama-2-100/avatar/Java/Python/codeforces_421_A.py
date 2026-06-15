def codeforces_421_A ( n , a , b ): Scanner = input Scanner = input ( ) n = int ( Scanner . next ( ) ) a = int ( Scanner . next ( ) ) b = int ( Scanner . next ( ) ) list1 = [ int ( Scanner . next ( ) ) for i in range ( a ) ] list2 = [ int ( Scanner . next ( ) ) for i in range ( b ) ] for i in range ( n ): if list1 . count ( i + 1 ) > 0 : print ( 1 + " " ) else : print ( 2 + " " )

