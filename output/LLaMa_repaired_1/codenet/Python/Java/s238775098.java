import java.util.Scanner;

public class s238775098 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double res = 0;
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            if (input.length > 1 && input[1].equals("BTC")) {
                res += Double.parseDouble(input[0]) * 380000;
            } else if (input.length > 0) {
                res += Double.parseDouble(input[0]);
            }
        }
        System.out.println(res);
    }
}