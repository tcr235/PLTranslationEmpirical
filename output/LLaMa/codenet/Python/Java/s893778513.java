import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String[] input = scanner.nextLine().split(" ");

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (String i : input) {
            int num = Integer.parseInt(i);
            if (num > max) {
                max = num;
            }
            sum += num;
        }

        System.out.println((max < sum - max) ? "Yes" : "No");
    }
}