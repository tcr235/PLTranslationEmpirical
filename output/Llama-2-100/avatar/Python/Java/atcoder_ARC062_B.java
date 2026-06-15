Scanner sc = new Scanner ( System.in );
List<Character> s = new ArrayList<Character> ( );
int numG = 0;
int numP = 0;
int score = 0;
for ( char x : s ) {
    if ( x == 'g' ) {
        if ( numG - numP > 0 ) {
            score++;
            numP++;
        } else {
            score = score;
            numG++;
        }
    } else if ( x == 'p' ) {
        if ( numG - numP > 0 ) {
            score = score;
            numP++;
        } else {
            score--;
            numG++;
        }
    }
}
System.out.println ( score );


