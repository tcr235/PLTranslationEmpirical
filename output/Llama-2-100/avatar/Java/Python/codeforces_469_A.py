def codeforces_469_A ( n , levels ):
    sc = input ()
    arr = [ int ( x ) for x in sc.split ( ) ]
    level2 = int ( sc.split ( ) [ 1 ] )
    level3 = levels + level2
    arr2 = [ int ( x ) for x in sc.split ( ) [ 2 : level3 ] ]
    arr3 = [ i for i in range ( n ) ]
    count = 0
    for i in range ( n ):
        for x in arr2:
            if arr3 [ i ] == x:
                count += 1
                break
        if count == n:
            print ( "I become the guy." )
        else:
            print ( "Oh, my keyboard!" )

