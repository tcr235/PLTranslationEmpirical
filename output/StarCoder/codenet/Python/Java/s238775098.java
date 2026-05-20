import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double res = 0;
        for (int i = 0; i < n; i++) {
            scanner.nextLine(); // Consume newline left-over
            String[] parts = scanner.nextLine().split(" ");
            String x = parts[0];
            String u = parts[1];
            if ("BTC".equals(u)) {
                res += Double.parseDouble(x) * 380000;
            } else {
                res += Integer.parseInt(x);
            }
        }
        System.out.println((int) Math.round(res));
    }
}