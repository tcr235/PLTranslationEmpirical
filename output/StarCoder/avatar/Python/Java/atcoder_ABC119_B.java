import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        double[] x = new double[N];
        double sum = 0;
        
        for (int i = 0; i < N; i++) {
            String input = scanner.nextLine();
            if (input.contains("JPY")) {
                input = input.replace("JPY", "* 1.0");
            } else if (input.contains("BTC")) {
                input = input.replace("BTC", "* 380000.0");
            }
            x[i] = Double.parseDouble(input.split("\\*")[1]);
            sum += x[i];
        }
        
        System.out.println(sum);
        scanner.close();
    }
}