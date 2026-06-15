def codeforces_673_A ( n ):
    a = [ int ( x ) for x in input ( ).split ( ) ]
    result , pos = 0 , 0
    flag = 0
    if a [ 0 ] > 15 :
        result = 15
    else:
        for i in range ( 1 , len ( a ) - 1 ):
            if a [ i ] - a [ i - 1 ] > 15 :
                pos = i - 1
                flag = 1
                break
        if flag == 1 :
            result = a [ pos ] + 15
        else:
            result = a [ len ( a ) - 1 ] + 15
    if result > 90 :
        result = 90
    print ( result )

