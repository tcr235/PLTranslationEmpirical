import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
            B[i] = 0;
        }

        int count = 1;
        for (int i = 0; i < N; i++) {
            if (A[i] - 1 >= 0 && A[i] - 1 < N) {
                B[A[i] - 1] = count;
                count++;
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(B[i] + " ");
        }
    }
}