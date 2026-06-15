def codeforces_99_A ( str ):
    dotIndex = 0
    for i in range ( len ( str ) ):
        if str [ i ] == '.':
            dotIndex = i
            break
        if str [ dotIndex - 1 ] == '9':
            print ( "GOTO Vasilisa." )
        else:
            _str = ''
            for j in range ( dotIndex ):
                _str += str [ j ]
            print ( int ( _str ) + 1 )

