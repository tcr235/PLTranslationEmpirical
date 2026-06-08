import java.util.Arrays;
import java.util.Scanner;

public class codeforces_624_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        int[] aReverse = new int[n];
        for (int i = 0; i < n; i++) {
            aReverse[i] = a[n - 1 - i];
        }
        int pre = Integer.MAX_VALUE;
        int ans = 0;
        for (int j = 0; j < n; j++) {
            ans += Math.max(0, Math.min(pre - 1, aReverse[j]));
            pre = Math.max(0, Math.min(pre - 1, aReverse[j]));
        }
        System.out.println(ans);
    }
}