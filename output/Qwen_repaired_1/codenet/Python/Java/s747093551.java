import java.util.Scanner;

class S747093551 {
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
        int maxX = Integer.MIN_VALUE, minX = Integer.MAX_VALUE;
        for (int value : x) {
            maxX = Math.max(maxX, value);
            minX = Math.min(minX, value);
        }

        int maxY = Integer.MIN_VALUE, minY = Integer.MAX_VALUE;
        for (int value : y) {
            maxY = Math.max(maxY, value);
            minY = Math.min(minY, value);
        }

        if (Math.max(maxX, X) < Math.min(minY, Y)) {
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