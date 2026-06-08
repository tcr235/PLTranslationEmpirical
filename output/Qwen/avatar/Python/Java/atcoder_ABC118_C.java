import java.util.Scanner;
import java.util.Arrays;

public class atcoder_ABC118_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        Arrays.sort(A);
        int gcd = A[0];
        for (int i = 1; i <= A.length / 2; i += a.length % n == 0 ? n : 1) {
            if (gcd % A[i] != 0) {
                while (gcd > A[i]) {
                    gcd--;
                    if (gcd % A[i] == 0) {
                        break;
                    }
                }
            }
        }
        System.out.println(gcd);
        scanner.close();
    }
}