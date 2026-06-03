import java.util.Arrays;
import java.util.Scanner;
import java.math.BigInteger;

public class atcoder_ABC118_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over
        String[] strArray = scanner.nextLine().split(" ");
        int[] A = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            A[i] = Integer.parseInt(strArray[i]);
        }
        int gcd = A[0];
        for (int i = 1; i < A.length; i++) {
            gcd = gcd(gcd, A[i]);
        }
        System.out.println(gcd);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}