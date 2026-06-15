def codeforces_154_A ( hi ):
    N = len ( hi )
    set = set ()
    K = int ( input () )
    res = 0
    for k in range ( K ):
        input_ = input ()
        a = 0
        b = 0
        for i in range ( N ):
            if hi [ i ] == input_ [ 0 ]:
                a += 1
            elif hi [ i ] == input_ [ 1 ]:
                b += 1
            else:
                res += min ( a, b )
                a = b = 0
        res += min ( a, b )
    print ( res )

