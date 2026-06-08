import java.util.Scanner;

public class s986062252 {
    public static int gcd(int a, int b) {
        if (a < b) return gcd(b, a);
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine(); // consume newline left-over
        String s = sc.nextLine();
        String t = sc.nextLine();
        int aa = gcd(n, m);
        int bb = lcm(n, m);
        int cc = bb / gcd(n / aa, m / aa);
        for (int i = 0; i < aa; ++i) {
            if (i < n / aa && i < m / aa && s.charAt(i) != t.charAt(i)) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(bb);
    }
}