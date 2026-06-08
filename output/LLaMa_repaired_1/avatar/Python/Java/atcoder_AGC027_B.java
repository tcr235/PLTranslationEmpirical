import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.stream.IntStream;

public class atcoder_AGC027_B {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        long[] S = new long[N];
        long sum = 0;
        for (int i = 0; i < N; i++) {
            sum += A[i];
            S[i] = sum;
        }
        long ans = Long.MAX_VALUE;
        for (int k = 1; k <= N; k++) {
            long E = k * X + 2 * sumSelected(S, N - 2 * k - 1, N - 1, -k);
            ans = Math.min(ans, E);
        }
        System.out.println(ans + N * X + 5 * S[N - 1]);
    }

    public static long sumSelected(long[] S, int fromIndex, int toIndex, int step) {
        return IntStream.range(fromIndex, toIndex + 1)
                .filter(i -> i % step == 0 && i <= toIndex)
                .mapToLong(i -> S[i])
                .sum();
    }
}