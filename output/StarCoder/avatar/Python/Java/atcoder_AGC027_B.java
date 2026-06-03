import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        
        int N = Integer.parseInt(input[0]);
        int X = Integer.parseInt(input[1]);
        List<Integer> A = new ArrayList<>();
        for (int i = 2; i <= N; i++) {
            A.add(Integer.parseInt(input[i]));
        }
        
        List<Integer> S = new ArrayList<>();
        int sum = 0;
        for (int num : A) {
            sum += num;
            S.add(sum);
        }
        
        double ans = Double.MAX_VALUE;
        for (int k = 1; k <= N / 3; k++) {
            double E = (double) k * X + 2 * getSum(S, N - 2 * k - 1, N, k);
            if (E < ans) {
                ans = E;
            }
        }
        
        System.out.println((int) (ans + N * X + 5 * S.get(N - 1)));
    }

    private static int getSum(List<Integer> S, int start, int end, int k) {
        int sum = 0;
        for (int i = start; i >= 0; i -= 2 * k) {
            sum += S.get(i);
        }
        return sum;
    }
}