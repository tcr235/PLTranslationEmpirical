import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class atcoder_AGC035_B {
    public static void main ( String [] args ) {
        int N = Integer.parseInt ( args [ 0 ] );
        int M = Integer.parseInt ( args [ 1 ] );
        List < Integer > edges = new ArrayList < > ( );
        List < Integer > degs = new ArrayList < > ( );
        List < Boolean > flag = new ArrayList < > ( );
        for ( int i = 0; i < N; i++ ) {
            edges.add ( new ArrayList < > ( ) );
            degs.add ( 0 );
            flag.add ( false );
        }
        for ( int i = 0; i < M; i++ ) {
            int a = Integer.parseInt ( args [ i * 2 + 1 ] );
            int b = Integer.parseInt ( args [ i * 2 + 2 ] );
            edges.get ( a - 1 ).add ( b - 1 );
            edges.get ( b - 1 ).add ( a - 1 );
            degs.set ( a - 1, degs.get ( a - 1 ) + 1 );
            degs.set ( b - 1, degs.get ( b - 1 ) + 1 );
        }
        if ( M % 2 != 0 ) {
            System.out.println ( - 1 );
            return;
        }
        PriorityQueue < Integer > Q = new PriorityQueue < > ( Collections.reverseOrder ( ) );
        for ( int i = 0; i < N; i++ ) {
            Q.add ( new Pair < Integer, Integer > ( degs.get ( i ), i ) );
        }
        while ( Q.size ( ) > 0 ) {
            Pair < Integer, Integer > _ = Q.poll ( );
            if ( flag.get ( _.second ) ) {
                continue;
            }
            flag.set ( _.second, true );
            for ( int j = 0; j < edges.get ( _.second ).size ( ); j++ ) {
                int v = edges.get ( _.second ).get ( j );
                if ( degs.get ( v ) != 0 && j == 0 ) {
                    System.out.println ( _.first + 1 + " " + v + 1 );
                    parity.set ( v, 1 - parity.get ( v ) );
                } else {
                    System.out.println ( v + 1 + " " + _.first + 1 );
                    parity.set ( v, 1 - parity.get ( v ) );
                }
                degs.set ( v, degs.get ( v ) - 1 );
                Q.add ( new Pair < Integer, Integer > ( degs.get ( v ), v ) );
            }
        }
    }
}


