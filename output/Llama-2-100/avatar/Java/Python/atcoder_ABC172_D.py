def atcoder_ABC172_D ( n ):
    sc = input ()
    ans = 0
    for i in range ( 1, n + 1 ):
        ans += ( i * ( n // i ) * ( ( n // i ) + 1 ) // 2 )
    print ( ans )

