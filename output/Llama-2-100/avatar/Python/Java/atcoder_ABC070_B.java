List<Integer> A = Arrays.asList ( input ( ).split ( ) .map ( Integer::new ) .toArray ( ) );
if ( A.get ( 1 ) <= A.get ( 2 ) or A.get ( 3 ) <= A.get ( 0 ) ) :
    System.out.println ( 0 );
else :
    A.sort ( );
    System.out.println ( A.get ( 2 ) - A.get ( 1 ) );


