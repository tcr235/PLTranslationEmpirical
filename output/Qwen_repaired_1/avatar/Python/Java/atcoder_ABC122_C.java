import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC122_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        String s = scanner.next();
        int[][] problems = new int[q][2];
        for (int i = 0; i < q; i++) {
            problems[i][0] = scanner.nextInt();
            problems[i][1] = scanner.nextInt();
        }
        int[] cumsum = new int[n + 1];
        Arrays.fill(cumsum, 0);
        for (int i = 1; i <= n; i++) {
            cumulativeSum(cumsum, s, i);
        }
        for (int[] problem : problems) {
            System.out.println(cumsum[problem[1] - 1] - cumsum[problem[0] - 1]);
        }
    }

    private static void cumulativeSum(int[] cumsum, String s, int i) {
        cumsum[i] = cumsum[i - 1] + (i >= 2 && s.charAt(i - 2) == 'A' && s.charAt(i - 1) == 'C' ? 1 : 0);
    }
}