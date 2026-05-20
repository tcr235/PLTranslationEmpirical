import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        String S = scanner.next().replaceAll("\\s", "");

        char c = S.charAt(K - 1);
        if (Character.isUpperCase(c)) {
            S = S.substring(0, K - 1) + String.valueOf(Character.toLowerCase(c)) + S.substring(K);
        } else {
            switch(c) {
                case 'a':
                    S = S.substring(0, K - 1) + 'b' + S.substring(K);
                    break;
                case 'b':
                    S = S.substring(0, K - 1) + 'c' + S.substring(K);
                    break;
            }
        }
        System.out.println(S);
    }
}