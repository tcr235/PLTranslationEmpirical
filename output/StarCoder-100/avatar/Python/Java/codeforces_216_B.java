import java.util.*;
public class codeforces_216_B {
    public static void main ( String [ ] args ) {
        Scanner sc = new Scanner ( System.in ) ;
        while ( true ) {
            int n = sc.nextInt ( ) ;
            int m = sc.nextInt ( ) ;
            if ( n == 0 and m == 0 )
                break ;
            int [ ] g = new int [ n + 1 ] [ ] ;
            for ( int i = 1 ; i <= n ; i ++ )
                g [ i ] = new int [ ] { } ;
            for ( int i = 0 ; i < m ; i ++ ) {
                int a = sc.nextInt ( ) ;
                int b = sc.nextInt ( ) ;
                g [ a ] = Arrays.copyOf ( g [ a ], g [ a ].length + 1 ) ;
                g [ a ] [ g [ a ].length - 1 ] = b ;
                g [ b ] = Arrays.copyOf ( g [ b ], g [ b ].length + 1 ) ;
                g [ b ] [ g [ b ].length - 1 ] = a ;
            }
            int ans = 0 ;
            for ( int i = 1 ; i <= n ; i ++ ) {
                boolean [ ] seen = new boolean [ n + 1 ] ;
                if ( dfs ( g, seen, i ) )
                    ans ++ ;
            }
            if ( ( n - ans ) % 2 == 1 )
                ans ++ ;
            System.out.println ( ans ) ;
        }
    }
    public static boolean dfs ( int [ ] g, boolean [ ] seen, int i ) {
        if ( seen [ i ] )
            return false ;
        seen [ i ] = true ;
        int nodes = 1 ;
        int edges = g [ i ].length ;
        for ( int j : g [ i ] ) {
            int x = dfs ( g, seen, j ) ;
            nodes += x ;
            edges += x ;
        }
        return nodes > 1 and nodes % 2 == 1 and 2 * nodes == edges ;
    }
}