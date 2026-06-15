def atcoder_AGC027_A ( N , x ): sc = input () N = int ( sc.readline ( ) ) x = int ( sc.readline ( ) ) sweet = [ int ( i ) for i in input ( ).split ( ) ] sorted ( sweet ) num = 0 for i in range ( N ): if x - sweet [ num ] >= 0 : x -= sweet [ num ] num += 1 if ( num == N ) and ( x > 0 ) : num -= 1 print ( num )

