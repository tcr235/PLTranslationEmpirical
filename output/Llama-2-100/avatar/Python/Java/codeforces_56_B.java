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
            int[] temp = new int[mn - 1];
            for (int i = 0; i < mn - 1; i++) {
                temp[i] = A[i];
            }
            for (int i = mn; i <= mx; i++) {
                temp[i - mn] = A[i];
            }
            System.out.println(mn + 1 + " " + (mx + 1));
        }
    }
}


