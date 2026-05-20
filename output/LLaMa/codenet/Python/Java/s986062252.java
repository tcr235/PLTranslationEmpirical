import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static int gcdd(int a, int b) {
        return b == 0 ? a : gcdd(b, a % b);
    }

    public static int lcms(int a, int b) {
        return a * b / gcdd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n = sc.nextInt();
        System.out.print("Enter the second number: ");
        int m = sc.nextInt();
        System.out.print("Enter the first string: ");
        String s = sc.next();
        System.out.print("Enter the second string: ");
        String t = sc.next();
        int aa = gcdd(n, m);
        int bb = lcms(n, m);
        int cc = (int) (Math.ceil(((double) aa / bb)));
        int ans1 = -1;
        for (int i = 0; i < cc; ++i) {
            if (i * aa / n < s.length() && i * aa / m < t.length() && s.charAt(i * aa / n) != t.charAt(i * aa / m)) {
                ans1 = -1;
                break;
            }
        }
        System.out.println(ans1 == -1 ? ans1 : bb);
    }
}