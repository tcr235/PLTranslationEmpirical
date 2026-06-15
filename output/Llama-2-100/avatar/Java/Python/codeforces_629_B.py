def codeforces_629_B ( n ):
    FfriendPerDay = [ 0 ] * 367
    MfriendPerDay = [ 0 ] * 367
    answer = 0
    for _ in range ( n ):
        c = input ( ).lower ( ) [ 0 ]
        a = int ( input ( ) )
        b = int ( input ( ) )
        for i in range ( a, b + 1 ):
            if c == 'M':
                MfriendPerDay [ i ] += 1
            else:
                FfriendPerDay [ i ] += 1
            if MfriendPerDay [ i ] < FfriendPerDay [ i ]:
                if MfriendPerDay [ i ] > answer:
                    answer = MfriendPerDay [ i ]
                else:
                    answer = FfriendPerDay [ i ]
    print ( answer * 2 )

