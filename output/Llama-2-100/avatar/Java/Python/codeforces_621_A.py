def codeforces_621_A ( n ): List = [ ] for i in range ( n ): List.append ( int ( input ( ) ) ) odd = [ ] for i in List: if i % 2 == 0: sum += i else: odd.append ( i ) Collections.sort ( odd ) for i in odd: sum += i if len ( odd ) % 2 != 0: sum -= odd [ 0 ] print ( sum )

