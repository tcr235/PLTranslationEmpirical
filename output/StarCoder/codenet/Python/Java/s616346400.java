import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(atc_079a(input));
    }

    public static String atc_079a(String input) {
        int n = 3;
        for (int i = 0; i <= input.length() - n; i++) {
            for (int j = 1; j < n; j++) {
                if (input.charAt(i) != input.charAt(i + j)) {
                    break;
                }
                if (j == n - 1) {
                    return "Yes";
                }
            }
        }
        return "No";
    }
}