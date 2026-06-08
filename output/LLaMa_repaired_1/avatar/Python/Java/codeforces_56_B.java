import java.util.Arrays;
import java.util.Scanner;

public class codeforces_56_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        int mn = N + 1;
        int mx = -1;
        for (int i = 0; i < N; i++) {
            if (i + 1 != A[i]) {
                mn = Math.min(mn, i);
                mx = Math.max(mx, i);
            }
        }

        if (mx == -1) {
            System.out.println("0 0");
        } else {
            int[] B = new int[N + 1];
            System.arraycopy(A, 0, B, 0, mn);
            B[mn] = A[mn];
            System.arraycopy(A, mn + 1, B, mn + 1, mx - mn);
            for (int i = mx + 1; i <= N; i++) {
                B[i] = A[i - 1];
            }
            Arrays.sort(B);
            for (int i = 1; i <= N; i++) {
                if (B[i] != i) {
                    System.out.println("0 0");
                    return;
                }
            }
            System.out.println((mn + 1) + " " + (mx + 1));
        }
    }
}