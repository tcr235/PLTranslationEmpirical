def codeforces_242_B ( n ):
    a = [ int ( x ) for x in input ( ).split ( ) ]
    b = [ int ( x ) for x in input ( ).split ( ) ]
    left = float ( 1e9 + 5 )
    right = 0
    for i in range ( n ):
        left = min ( left, a [ i ] )
        right = max ( right, b [ i ] )
    for i in range ( n ):
        if left == a [ i ] and right == b [ i ]:
            print ( i + 1 )
            return
    print ( - 1 )

