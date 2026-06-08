import java.util.Scanner;

public class codeforces_265_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] l = new int[n];
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
            maximum = Math.max(maximum, l[i]);
        }

        int ans = 0, last = 0;
        for (int i : l) {
            ans += Math.abs(last - i) + 1;
            if (i != maximum) {
                last = i;
            }
        }

        System.out.println(ans);
    }
}