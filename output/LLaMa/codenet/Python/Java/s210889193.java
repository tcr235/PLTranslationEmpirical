import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] action = new int[N][3];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                action[i][j] = scanner.nextInt();
            }
        }
        
        int[][] dp = new int[N][3];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                dp[i][j] = 0;
            }
        }
        
        for (int j = 0; j < 3; j++) {
            dp[0][j] = action[0][j];
        }
        
        for (int i = 1; i < N; i++) {
            dp[i][0] = Math.max(dp[i-1][1] + action[i][0], dp[i-1][2] + action[i][0]);
            dp[i][1] = Math.max(dp[i-1][0] + action[i][1], dp[i-1][2] + action[i][1]);
            dp[i][2] = Math.max(dp[i-1][0] + action[i][2], dp[i-1][1] + action[i][2]);
        }
        
        System.out.println(Math.max(Math.max(dp[N-1][0], dp[N-1][1]), dp[N-1][2]));
    }
}