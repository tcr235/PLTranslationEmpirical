import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        String S = scanner.next();
        System.out.println(cutString(S, K));
    }

    public static String cutString(String S, int K) {
        if (S.length() <= K) {
            return S;
        }
        return S.substring(0, K) + "...";
    }
}