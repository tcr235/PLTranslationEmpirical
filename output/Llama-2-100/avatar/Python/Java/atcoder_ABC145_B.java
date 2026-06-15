import java.util.Scanner;

public class atcoder_ABC145_B {

public static void main ( String [] args ) {

int n = Integer.parseInt ( sc.nextLine ( ) );
String s = sc.nextLine ( );

if ( n % 2 != 0 ) {

System.out.println ( "No" );

} else if ( s.substring ( 0, n / 2 ) == s.substring ( n / 2 ) ) {

System.out.println ( "Yes" );

} else {

System.out.println ( "No" );

}

}

}
