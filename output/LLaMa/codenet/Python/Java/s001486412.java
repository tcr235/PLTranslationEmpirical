import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sum = 0;
        for (int i = 0; i < n; i++) {
            double a = scanner.nextDouble();
            sum += 1 / a;
        }
        scanner.close();
        System.out.println(1 / sum);
    }
}