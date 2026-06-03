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
        for (int i = 0; i < N; i++) {
            S[i] = (long) accumulate(A, i);
            A[i] = 0;
        }
        long ans = Long.MAX_VALUE;
        for (int k = 1; k <= N; k++) {
            long E = k * X + 2 * sum(S, N - 2 * k - 1, -1, -k);
            ans = Math.min(ans, E);
        }
        System.out.println(ans + N * X + 5 * S[N - 1]);
    }

    public static long accumulate(int[] A, int fromIndex) {
        long sum = 0;
        for (int i = fromIndex; i < A.length; i++) {
            sum += A[i];
            A[i] = 0;
        }
        return sum;
    }

    public static long sum(long[] S, int fromIndex, int toIndex, int step) {
        return IntStream.range(fromIndex, toIndex + 1)
                .map(i -> S[i])
                .sum() * step;
    }
}