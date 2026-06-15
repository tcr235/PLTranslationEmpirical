def atcoder_ABC106_C (): long k = int ( input ( ) ) scan = input ( ) str = scan.decode ( ) char c [ ] = str.lower ( ).replace ( ' ' , '' ) for i in range ( len ( c ) ): if c [ i ] == '1': break if i == k - 1: print ( 1 ) return else: print ( c [ i ] ) return

