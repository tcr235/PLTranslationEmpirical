import java.util.Scanner;

public class Main {
    public static String main() {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        String S = scanner.next();
        if (S.length() <= K) {
            return S;
        }
        return S.substring(0, K) + "...";
    }

    public static void main(String[] args) {
        System.out.println(main());
    }
}