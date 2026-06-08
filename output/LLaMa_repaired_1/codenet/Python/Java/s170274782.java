import java.util.Arrays;
import java.util.Scanner;

public class s170274782 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] A = new int[2][N];

        for (int j = 0; j < 2; j++) {
            String input = scanner.nextLine();
            int[] s = Arrays.stream(input.split("\\s+")).mapToInt(Integer::parseInt).toArray();
            A[j] = s;
        }

        int[] ans = new int[N];
        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = 0; j <= i; j++) {
                count += A[0][j];
            }
            for (int j = i; j < N; j++) {
                count += A[1][j];
            }
            ans[i] = count;
        }

        int max = Arrays.stream(ans).max().getAsInt();
        System.out.println(max);
    }
}