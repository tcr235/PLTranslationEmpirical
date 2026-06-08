import java.util.Scanner;

public class atcoder_ABC119_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine().trim());
        double[] x = new double[N];
        double sum = 0.0;
        
        for (int i = 0; i < N; i++) {
            String input = scanner.nextLine().trim();
            String[] parts = input.split(" ");
            double value = Double.parseDouble(parts[0].trim());
            String currency = parts[1].trim();
            
            if ("BTC".equals(currency)) {
                value *= 380000.0;
            }
            
            x[i] = value;
            sum += x[i];
        }
        
        System.out.printf("%.2f\n", sum);
        scanner.close();
    }
}