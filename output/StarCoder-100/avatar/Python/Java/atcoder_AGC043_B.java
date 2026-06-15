import java.util.*;
public class atcoder_AGC043_B {
    public static void main ( String [ ] args ) {
        Scanner sc = new Scanner ( System.in );
        int n = sc.nextInt ( );
        int [ ] nums = new int [ n ];
        for ( int i = 0 ; i < n ; i ++ )
            nums [ i ] = sc.nextInt ( ) - 1;
        boolean noOne = false;
        if ( nums [ 0 ]!= 0 ) {
            for ( int i = 0 ; i < n ; i ++ )
                nums [ i ] /= 2;
            noOne = true;
        }
        boolean isOdd = false;
        for ( int i = 0 ; i < n ; i ++ )
            if (!parityOfNCR ( n - 1, i ) && nums [ i ] % 2 == 1 )
                isOdd ^= true;
        if (!isOdd )
            System.out.println ( 0 );
        else
            System.out.println ( 1 << noOne );
    }
    public static boolean parityOfNCR ( int n, int r ) {
        int f = 0;
        for ( int i = 1 ; i <= n ; i ++ )
            f += ( 1 << ( n - i ) ) * i;
        return f - ( 1 << ( n - r ) ) * r - ( 1 << ( n - r - 1 ) ) * ( r - 1 ) > 0;
    }
}
