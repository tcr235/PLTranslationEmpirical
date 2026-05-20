import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }
        Arrays.sort(A);
        System.out.println(A[A.length - 1] - A[0]);
    }
}