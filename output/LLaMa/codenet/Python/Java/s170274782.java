import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] A = new int[2][];
        A[0] = new int[N];
        A[1] = new int[N];

        for (int j = 0; j < 2; j++) {
            A[j] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        int[] ans = new int[N];
        for (int i = 0; i < N; i++) {
            count = 0;
            count = count + sum(A[0], 0, i + 1) + sum(A[1], i, N);
            ans[i] = count;
        }

        int max = Arrays.stream(ans).max().getAsInt();
        System.out.println(max);
    }

    public static int sum(int[] arr, int start, int end) {
        int sum = 0;
        for (int i = start; i < Math.min(end, arr.length); i++) {
            sum += arr[i];
        }
        return sum;
    }
}