import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int sa = scanner.next().replaceAll("-", "").length();
        sa = Math.min(n - sa, sa);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            b -= a;
            sb.append(b % 2 == 1 && b <= (sa << 1) ? "1\n" : "0\n");
        }
        System.out.println(sb.toString());
        scanner.close();
    }
}