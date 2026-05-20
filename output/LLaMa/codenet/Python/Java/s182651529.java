import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] score = new int[N];
        for (int i = 0; i < N; i++) {
            score[i] = scanner.nextInt();
        }

        for (int i = 0; i < N - K; i++) {
            int mae = i;
            int usiro = i + K;

            if (Arrays.stream(score).slice(mae, mae + 1).min().getAsInt() < 
                Arrays.stream(score).slice(usiro, usiro + 1).min().getAsInt()) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        scanner.close();
    }
}