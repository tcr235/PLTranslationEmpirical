import java.util.Arrays;
import java.util.Scanner;

public class Main {
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
            int[] B = new int[N];
            System.arraycopy(A, 0, B, 0, mn);
            System.arraycopy(A, mn, B, mn, mx - mn + 1);
            for (int i = mx + 1; i < N; i++) {
                B[i] = A[i];
            }
            System.arraycopy(A, mx + 1, B, mx + 1, N - mx - 1);
            Arrays.sort(B);
            if (Arrays.equals(B, A)) {
                System.out.println((mn + 1) + " " + (mx + 1));
            } else {
                System.out.println("0 0");
            }
        }
    }
}