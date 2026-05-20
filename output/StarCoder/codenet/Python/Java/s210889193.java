import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        List<List<Integer>> action = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine();
            List<Integer> row = new ArrayList<>();
            for (String s : line.split(" ")) {
                row.add(Integer.parseInt(s));
            }
            action.add(row);
        }
        
        Integer[][] dp = new Integer[N][3];
        
        for (int i = 0; i < 3; i++) {
            dp[0][i] = action.get(0).get(i);
        }
        
        for (int i = 1; i < N; i++) {
            dp[i][0] = Math.max(dp[i-1][1] + action.get(i).get(0), dp[i-1][2] + action.get(i).get(0));
            dp[i][1] = Math.max(dp[i-1][0] + action.get(i).get(1), dp[i-1][2] + action.get(i).get(1));
            dp[i][2] = Math.max(dp[i-1][0] + action.get(i).get(2), dp[i-1][1] + action.get(i).get(2));
        }
        
        System.out.println(Math.max(Math.max(dp[N-1][0], dp[N-1][1]), dp[N-1][2]));
        scanner.close();
    }
}