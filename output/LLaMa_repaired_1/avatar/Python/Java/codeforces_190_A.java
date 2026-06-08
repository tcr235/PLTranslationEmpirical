import java.util.Scanner;

public class codeforces_190_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers separated by a space: ");
        String[] numbers = scanner.nextLine().split(" ");
        int n = Integer.parseInt(numbers[0]);
        int m = Integer.parseInt(numbers[1]);

        if (n < 1) {
            if (m < 1) {
                System.out.println(n + " " + m);
            } else {
                System.out.println("Impossible");
            }
        } else if (m > n) {
            int min = m;
            int max = n + m - 1;
            System.out.println(min + " " + max);
        } else {
            int min = n;
            int max = n + m - 1;
            if (m == 0) {
                max = n;
            }
            System.out.println(min + " " + max);
        }
    }
}