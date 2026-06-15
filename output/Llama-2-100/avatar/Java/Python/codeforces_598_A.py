def codeforces_598_A ( n ):
    q = int ( input ( ) )
    while q > 0:
        x = ( int ) ( math.log ( n ) / math.log ( 2 ) )
        x += 1
        s = - 1 * ( long ) math.pow ( 2 , x ) + 2 + ( ( long ) n * ( long ) ( n + 1 ) ) / 2 - ( long ) math.pow ( 2 , x )
        print ( s )
        q -= 1

