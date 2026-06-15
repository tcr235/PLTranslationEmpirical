def codeforces_637_A ( n ):

sc = input ()
pw = output ()

ara = [ int ( x ) for x in sc.split ( ) ]

map = { x : 1 for x in ara }

for x in ara :

if x not in map :

map [ x ] = 1

else :

map [ x ] += 1

max = 0

for k, v in map.items ( ):

if v == max :

print ( k, end = " " )

break

else :

map [ k ] += 1

pw.close ( )

def debug ( * obj ):

print ( obj )

n = int ( input () )

ara = [ int ( x ) for x in input ().split ( ) ]

codeforces_637_A ( n )

debug ( "ara", ara )

debug ( "map", map )

debug ( "mm", mm )
