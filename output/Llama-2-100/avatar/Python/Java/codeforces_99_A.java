import java.util.Scanner;

public class codeforces_99_A {

    public static void main ( String [] args ) {

        Scanner sc = new Scanner ( System.in );
        String l = sc.nextLine ( );
        String [] split = l.split ( "." );
        String s = String.join ( "", split [ 0 ] );
        int i = Integer.parseInt ( split [ 1 ] );

        if ( s.charAt ( s.length ( ) - 1 ) == '9' ) {
            System.out.println ( "GOTO Vasilisa." );
        } else if ( s.charAt ( s.length ( ) - 1 ) != '9' && i < 5 ) {
            System.out.println ( s );
        } else {
            s = String.join ( "", s );
            System.out.println ( Integer.parseInt ( s ) + 1 );
        }

    }

}
