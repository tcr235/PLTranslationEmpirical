import java.util.Scanner;

public class codeforces_302_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int sa = scanner.nextLine().replace("-", "").length();
        sa = Math.min(n - sa, sa);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            input = scanner.nextLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            b -= a;
            sb.append(b % 2 == 1 && b <= (sa << 1) ? "1\n" : "0\n");
        }
        System.out.println(sb.toString());
        scanner.close();
    }
}