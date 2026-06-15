def codeforces_31_A ( n ):
    a = [ int ( i ) for i in range ( n + 1 ) ]
    for k in range ( n ):
        t = a [ k ]
        for i in range ( n - 1 ):
            for j in range ( n - 1 ):
                if i != j and t == ( a [ i ] + a [ j ] ):
                    return 1
                if t == ( a [ i ] + a [ j ] ):
                    return 1
    return 0

