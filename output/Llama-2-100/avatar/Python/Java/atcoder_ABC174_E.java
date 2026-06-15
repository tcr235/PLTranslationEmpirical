public static int check ( int[] lis , int k , int mid ) {
    for ( int i = 0; i < lis.length; i++ ) {
        if ( lis [i] % mid == 0 ) {
            k++;
        } else {
            k -= ( lis [i] / mid );
        }
    }
    return k >= 0;
}

public static void main ( String[] args ) {
    int n , k;
    Scanner sc = new Scanner ( System.in );
    n = sc.nextInt();
    k = sc.nextInt();
    int[] lis = new int[n];
    for ( int i = 0; i < n; i++ ) {
        lis [i] = sc.nextInt();
    }
    int a = 1;
    int b = max ( lis );
    int ans = b;
    while ( a <= b ) {
        int mid = ( a + b ) / 2;
        if ( check ( lis , k , mid ) ) {
            ans = mid;
            b = mid - 1;
        } else {
            a = mid + 1;
        }
    }
    System.out.println ( ans );
}
