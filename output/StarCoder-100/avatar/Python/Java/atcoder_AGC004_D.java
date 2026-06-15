import java.util.*;
import java.io.*;
public class atcoder_AGC004_D {
    public static void main ( String [ ] args ) throws IOException {
        BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ) ) ;
        int n = Integer.parseInt ( br.readLine ( ) ) ;
        int k = Integer.parseInt ( br.readLine ( ) ) ;
        int [ ] aaa = new int [ n ] ;
        for ( int i = 0 ; i < n ; i ++ ) {
            aaa [ i ] = Integer.parseInt ( br.readLine ( ) ) ;
        }
        int [ ] links = new int [ n ] ;
        for ( int i = 0 ; i < n ; i ++ ) {
            links [ i ] = new TreeSet < > ( ) ;
        }
        for ( int i = 0 ; i < n ; i ++ ) {
            int a = aaa [ i ] ;
            if ( a!= 0 ) {
                links [ a - 1 ].add ( i ) ;
            }
        }
        int [ ] ans = new int [ 2 ] ;
        dfs ( links, n, k, 0, 0, ans ) ;
        if ( aaa [ 0 ]!= 1 ) {
            ans [ 1 ] += 1 ;
        }
        System.out.println ( ans [ 1 ] ) ;
    }
    public static void dfs ( int [ ] links, int n, int k, int v, int p, int [ ] ans ) {
        int height_from_leaf = 0 ;
        int cut_count = 0 ;
        for ( int u : links [ v ] ) {
            if ( u == 0 ) {
                continue ;
            }
            int [ ] hgt_cut = new int [ 2 ] ;
            dfs ( links, n, k, u, v, hgt_cut ) ;
            height_from_leaf = Math.max ( height_from_leaf, hgt_cut [ 0 ] ) ;
            cut_count += hgt_cut [ 1 ] ;
        }
        height_from_leaf += 1 ;
        if ( p!= 0 && height_from_leaf == k ) {
            height_from_leaf = 0 ;
            cut_count += 1 ;
        }
        ans [ 0 ] = Math.max ( ans [ 0 ], height_from_leaf ) ;
        ans [ 1 ] += cut_count ;
    }
}
