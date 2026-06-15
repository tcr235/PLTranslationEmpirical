def codeforces_351_A ():
    n = int ( input ( ) )
    arr = [ double ( input ( )) for _ in range ( 2 * n ) ]
    non_int = 0
    sum = 0
    for i in range ( 2 * n ):
        num = double ( input ( ) )
        sum += num
        if not math.floor ( num ) == num:
            non_int += 1
    max_sum = min ( n, non_int ) + sum
    min_sum = max ( 0, non_int - n ) + sum
    ans = min ( min_sum - sum, max_sum - sum )
    print ( ans, end = "." )

