import java.util.Scanner;

public class atcoder_ABC154_A {
    public static void solve(String S, String T, int A, int B, String U) {
        if (S.equals(U)) {
            A--;
        }
        if (T.equals(U)) {
            B--;
        }
        System.out.println(A + " " + B);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNext()) {
                String s = scanner.next();
                if (String.valueOf(s).equals("S")) S = s;
                else if (String.valueOf(s).equals("T")) T = s;
                else if (String.valueOf(s).equals("A")) A = scanner.nextInt();
                else if (String.valueOf(s).equals("B")) B = scanner.nextInt();
                else if (String.valueOf(s).equals("U")) U = s;
            }
            solve(S, T, A, B, U);
        }
    }

    static String S;
    static String T;
    static int A;
    static int B;
    static String U;
}