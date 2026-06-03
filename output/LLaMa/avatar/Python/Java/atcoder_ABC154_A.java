import java.util.Scanner;
import java.util.function.Supplier;

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

    public static void main(String[] args) {
        Supplier<String> iterateTokens = () -> {
            try (Scanner scanner = new Scanner(System.in)) {
                while (scanner.hasNext()) {
                    yield scanner.next();
                }
            }
            return null;
        };

        String S = iterateTokens.get();
        String T = iterateTokens.get();
        int A = Integer.parseInt(iterateTokens.get());
        int B = Integer.parseInt(iterateTokens.get());
        String U = iterateTokens.get();
        solve(S, T, A, B, U);
    }
}