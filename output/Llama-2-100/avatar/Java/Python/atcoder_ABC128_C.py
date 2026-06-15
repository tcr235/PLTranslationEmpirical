def atcoder_ABC128_C ( ):
    sc = input ()
    N = int ( sc.next ( ) )
    M = int ( sc.next ( ) )
    a = [ 0 ] * N
    for i in range ( N ):
        a.append ( 0 )
    for i in range ( M ):
        k = int ( sc.next ( ) )
        for j in range ( k ):
            s = int ( sc.next ( ) )
            s -= 1
            a [ s ] |= ( 1 << i )
    p = 0
    for i in range ( M ):
        x = int ( sc.next ( ) )
        p |= ( x << i )
    ans = 0
    for s in range ( ( 1 << N ) ):
        t = 0
        for i in range ( N ):
            if ( ( s >> i ) & 1 ) == 1:
                t ^= a [ i ]
        if p == t:
            ans += 1
    print ( ans )

