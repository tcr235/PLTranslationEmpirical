import java.util.Scanner;

public class codeforces_302_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int sa = scanner.nextInt();
        int minSa = Math.min(n - sa, sa);
        String[] ss = new String[m];
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            b -= a;
            if (b % 2 == 0 && b <= minSa << 1) {
                ss[i] = "1\n";
            } else {
                ss[i] = "0\n";
            }
        }
        System.out.println(String.join("", ss));
    }
}


