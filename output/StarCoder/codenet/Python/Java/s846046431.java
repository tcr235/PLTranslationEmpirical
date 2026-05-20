import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }
        Arrays.sort(A);
        long S = Arrays.stream(A).sum();
        long max = A[M - 1];
        if ((double)max / S - 1.0 / (4 * M) >= 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}