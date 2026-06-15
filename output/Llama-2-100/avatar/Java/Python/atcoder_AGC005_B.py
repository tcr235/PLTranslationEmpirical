def atcoder_AGC005_B ( N ):

scanner = input ()

a = [ int ( x ) for x in scanner.split ( ) ]

leftl = [ 0 for _ in range ( N ) ]

rightl = [ 0 for _ in range ( N ) ]

que = deque ( )

index = 0

while index < N:

while not que.empty () and a [ que.peek () ] > a [ index ]:

ind = que.popleft ()

rightl [ ind ] = index - ind - 1

que.pushleft ( index + 1 )

index += 1

while not que.empty ():

ind = que.popleft ()

rightl [ ind ] = N - ind - 1

index -= 1

while index >= 0:

while not que.empty () and a [ que.peek () ] > a [ index ]:

ind = que.popleft ()

leftl [ ind ] = ind - index - 1

que.pushleft ( index - 1 )

index -= 1

while not que.empty ():

ind = que.popleft ()

leftl [ ind ] = ind - index - 1

ans = 0

for i in range ( N ):

ans += ( long ) a [ i ] * ( leftl [ i ] + 1 ) * ( rightl [ i ] + 1 )

print ( ans )

