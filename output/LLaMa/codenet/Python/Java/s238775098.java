import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = 0;
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            if (input[1].equals("BTC")) {
                res += (int) (Float.parseFloat(input[0]) * 380000);
            } else {
                res += Integer.parseInt(input[0]);
            }
        }
        System.out.println(res);
    }
}