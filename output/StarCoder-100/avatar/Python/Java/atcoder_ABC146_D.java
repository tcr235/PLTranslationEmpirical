import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;

public class atcoder_ABC146_D {
    public static void main ( String [ ] args ) {
        Scanner sc = new Scanner ( System.in );
        int N = sc.nextInt ( );
        List < Integer > [ ] G = new ArrayList < > [ N ];
        for ( int i = 0 ; i < N ; i ++ ) {
            G [ i ] = new ArrayList < > ( );
        }
        Map < Integer, Integer > E = new HashMap < > ( );
        for ( int i = 0 ; i < N - 1 ; i ++ ) {
            int a = sc.nextInt ( ) - 1;
            int b = sc.nextInt ( ) - 1;
            G [ a ].add ( b );
            G [ b ].add ( a );
            E.put ( a * N + b, 0 );
            E.put ( b * N + a, 0 );
        }
        int K = bfs ( 0, N, G, E );
        System.out.println ( K );
        for ( int value : E.values ( ) ) {
            System.out.println ( value );
        }
    }
    public static int bfs ( int v, int N, List < Integer > [ ] G, Map < Integer, Integer > E ) {
        boolean [ ] visited = new boolean [ N ];
        Queue < Integer > queue = new LinkedList < > ( );
        int K = - 1;
        int [ ] node2color = new int [ N ];
        queue.add ( v );
        visited [ v ] = true;
        while (!queue.isEmpty ( ) ) {
            int q = queue.poll ( );
            int color = 0;
            for ( int nex : G [ q ] ) {
                if ( visited [ nex ] ) {
                    continue;
                }
                visited [ nex ] = true;
                color += 1;
                if ( color == node2color [ q ] ) {
                    color += 1;
                }
                node2color [ nex ] = color;
                E.put ( Math.min ( q, nex ) * N + Math.max ( q, nex ), color );
                queue.add ( nex );
            }
            K = Math.max ( K, color );
        }
        return K;
    }
}
