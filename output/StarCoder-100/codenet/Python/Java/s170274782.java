import java.util.*;

public class s170274782 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] A = new int[2][N];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        int[] ans = new int[N];
        for (int i = 0; i < N; i++) {
            int baselis = A[0][i];
            int groundlis = A[1][i];
            int count = 0;
            count = count + sum(baselis, i + 1) + sum(groundlis, N - i);
            ans[i] = count;
        }
        System.out.println(max(ans));
    }

    public static int sum(int[] A, int n) {
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = ans + A[i];
        }
        return ans;
    }

    public static int max(int[] A) {
        int ans = A[0];
        for (int i = 1; i < A.length; i++) {
            if (ans < A[i]) {
                ans = A[i];
            }
        }
        return ans;
    }
}
