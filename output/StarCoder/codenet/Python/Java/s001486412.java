import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextDouble();
        }
        double below = 0;
        for (int i = 0; i < n; i++) {
            below += 1 / a[i];
        }
        System.out.println(1 / below);
        scanner.close();
    }
}