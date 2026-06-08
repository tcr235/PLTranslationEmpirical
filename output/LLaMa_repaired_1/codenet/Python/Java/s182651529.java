import java.util.Arrays;
import java.util.Scanner;

public class s182651529 {
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

            System.out.println(
                Arrays.stream(score).limit(1).min().getAsInt() 
                < Arrays.stream(score).limit(K).skip(i + K).min().getAsInt() ? "Yes" : "No"
            );
        }
        scanner.close();
    }
}