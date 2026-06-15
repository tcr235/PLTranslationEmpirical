import java.util.*;
public class atcoder_AGC011_C {
    public static void main ( String [ ] args ) {
        Scanner sc = new Scanner ( System.in ) ;
        int n = sc.nextInt ( ) ;
        int m = sc.nextInt ( ) ;
        int [ ] vis = new int [ n + 1 ] ;
        int ci = 0 ;
        int cb = 0 ;
        int cc = 0 ;
        ArrayList < Integer > [ ] g = new ArrayList < > [ n + 1 ] ;
        for ( int i = 0 ; i <= n ; i ++ ) {
            g [ i ] = new ArrayList < > ( ) ;
        }
        for ( int i = 0 ; i < m ; i ++ ) {
            int u = sc.nextInt ( ) ;
            int v = sc.nextInt ( ) ;
            g [ u ].add ( v ) ;
            g [ v ].add ( u ) ;
        }
        for ( int i = 1 ; i <= n ; i ++ ) {
            if ( vis [ i ] == 0 ) {
                if ( g [ i ].size ( ) == 0 ) {
                    ci ++ ;
                } else {
                    boolean flag = true ;
                    for ( int j = 0 ; j < g [ i ].size ( ) ; j ++ ) {
                        if ( vis [ g [ i ].get ( j ) ] == 0 ) {
                            flag = false ;
                            break ;
                        }
                    }
                    if ( flag ) {
                        cb ++ ;
                    } else {
                        cc ++ ;
                    }
                }
            }
        }
        System.out.println ( ci * ci + 2 * ci * ( n - ci ) + cc * cc + 2 * cb * cc + 2 * cb * cb ) ;
    }
}

