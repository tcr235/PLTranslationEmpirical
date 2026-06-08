import java.util.*;
import java.io.*;

public class atcoder_AGC027_B {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        
        int N = Integer.parseInt(input[0]);
        int X = Integer.parseInt(input[1]);
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < N - 1; i++) {
            A.add(Integer.parseInt(input[i + 2]));
        }
        
        List<Integer> S = new ArrayList<>();
        int sum = 0;
        for (int num : A) {
            sum += num;
            S.add(sum);
        }
        
        double ans = Double.MAX_VALUE;
        for (int k = 1; k <= N / 3; k++) {
            double E = (double) k * X + 2 * getSum(S, k, N - k, k);
            ans = Math.min(ans, E);
        }
        
        System.out.println((int) (ans + N * X + 5 * S.get(N - 1)));
    }

    private static double getSum(List<Integer> S, int start, int end, int k) {
        double sum = 0;
        for (int i = start; i < S.size(); i += k) {
            sum += S.get(i);
        }
        return sum;
    }
}