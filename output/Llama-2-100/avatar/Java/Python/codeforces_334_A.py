def codeforces_334_A ( n ):

scanner = input ( )
print_writer = output ( )

n = int ( scanner.next ( ) )

square = n * n

odd = [ ]
even = [ ]

for i in range ( 1, square + 1 ):

if i % 2 == 0:

even.append ( i )

else:

odd.append ( i )

loop = square / n

div = loop / 2

print ( div )

for i in range ( 1, loop + 1 ):

for j in range ( 0, div ):

if i % 2 == 1:

print ( odd.pop ( 0 ) + " " + ( even.pop ( ) ) + " " )

else:

print ( even.pop ( 0 ) + " " + ( odd.pop ( ) ) + " " )

print ( )

print_writer.close ( )

def debug ( *obj ):

print ( ", ".join ( map ( str, obj ) ) )

if __name__ == "__main__":

n = int ( input ( ) )

codeforces_334_A ( n )

debug ( n, square, odd, even )
