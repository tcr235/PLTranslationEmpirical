import java.util.*;
import java.io.*;
import java.math.*;
import java.util.function.*;
import java.util.stream.*;
import java.util.regex.*;

public class atcoder_ABC089_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> s = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            s.add(sc.next());
        }
        char[][] march = new char[5][];
        for (int i = 0; i < 5; i++) {
            march[i] = new char[n];
        }
        for (int i = 0; i < n; i++) {
            char c = s.get(i).charAt(0);
            march[c - 'A'][i] = 1;
        }
        int ans = 0;
        for (int[] x : combinations(march, 3)) {
            ans += x[0] * x[1] * x[2];
        }
        System.out.println(ans);
    }

    public static int[] combinations(char[][] march, int n) {
        int[][] dp = new int[n][n];
        dp[0][0] = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j > 0 && march[i - 1][j - 1] == 'M') {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n - 1][n - 1];
    }
}


