import java.util.Scanner;

public class codeforces_190_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        if (n < 1 || m < 1) {
            System.out.println(n + " " + m);
            return;
        }

        int min = Math.max(n, m);
        int max = n + m - 1;

        System.out.println(min + " " + max);
    }
}