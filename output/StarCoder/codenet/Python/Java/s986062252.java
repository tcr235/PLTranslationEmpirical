import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String s = scanner.next();
        String t = scanner.next();

        int aa = gcd(n, m);
        int bb = lcm(n, m);

        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();

        boolean valid = true;
        for (int i = 0; i < aa && valid; i++) {
            if (sc[n/aa*i] != tc[m/aa*i]) {
                System.out.println(-1);
                valid = false;
            }
        }

        if (valid) {
            System.out.println(bb);
        }
    }

    public static int gcd(int a, int b) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}