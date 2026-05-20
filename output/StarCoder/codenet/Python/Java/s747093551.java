import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        
        int[] x = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = scanner.nextInt();
        }
        
        int[] y = new int[M];
        for (int i = 0; i < M; i++) {
            y[i] = scanner.nextInt();
        }
        
        scanner.close();
        
        boolean isNoWar = true;
        int maxX = -2147483648, minX = 2147483647;
        for (int value : x) {
            maxX = Math.max(maxX, value);
            minX = Math.min(minX, value);
        }
        
        int maxY = -2147483648, minY = 2147483647;
        for (int value : y) {
            maxY = Math.max(maxY, value);
            minY = Math.min(minY, value);
        }
        
        if (max(maxX, X) < min(minY, Y)) {
            System.out.println("No War");
        } else {
            System.out.println("War");
        }
        
        // Helper methods
        static int max(int a, int b) {
            return (a > b) ? a : b;
        }

        static int min(int a, int b) {
            return (a < b) ? a : b;
        }
    }
}