import java.util.Scanner;

public class atcoder_ABC119_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        double[] x = new double[N];
        for (int i = 0; i < N; i++) {
            String input = scanner.next().replace("JPY", "* 1.0").replace("BTC", "* 380000.0");
            x[i] = Double.parseDouble(input);
        }

        double sum = 0;
        for (double value : x) {
            sum += value;
        }

        System.out.println(sum);
    }
}