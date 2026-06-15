public class codeforces_651_A {

    public static void main(String[] args) {
        // x , y = map ( int , input ( ).split ( ) )
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        // print ( max ( x + y - 3 + ( ( y - x ) % 3 > 0 ) , 0 ) )
        int max = Math.max(x + y - 3 + (y - x) % 3 > 0, 0);
        System.out.println(max);

        // num_inp = lambda : int ( input ( ) )
        int numInp = scanner.nextInt();

        // arr_inp = lambda : list ( map ( int , input ( ).split ( ) ) )
        List<Integer> arrInp = Arrays.asList(scanner.nextLine().split(" "));

        // sp_inp = lambda : map ( int , input ( ).split ( ) )
        List<Integer> spInp = Arrays.asList(scanner.nextLine().split(" "));

        // str_inp = lambda : input ( )
        String strInp = scanner.nextLine();

    }
}
