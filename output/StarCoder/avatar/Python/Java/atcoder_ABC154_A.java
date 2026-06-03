import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void solve(String S, String T, int A, int B, String U) {
        if (S.equals(U)) {
            A--;
        }
        if (T.equals(U)) {
            B--;
        }
        System.out.println(A + " " + B);
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String T = scanner.next();
        int A = Integer.parseInt(scanner.next());
        int B = Integer.parseInt(scanner.next());
        String U = scanner.next();
        solve(S, T, A, B, U);
    }
}