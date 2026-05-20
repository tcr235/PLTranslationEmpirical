import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        int s = A[0] ^ A[1];
        for (int i = 2; i < N; i++) {
            s = s ^ A[i];
        }
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = s ^ A[i];
        }
        StringBuilder L = new StringBuilder();
        for (int a : B) {
            L.append(a).append(" ");
        }
        System.out.println(L.toString());
    }
}