import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int X = sc.nextInt();
            int K = sc.nextInt();
            int D = sc.nextInt();

            int r = X / D;
            if (Math.abs(r) > K) {
                System.out.println(Math.abs(X) - K * D);
                System.exit(0);
            }
            int a = X - r * D;
            if ((K - r) % 2 == 0) {
                System.out.println(a);
            } else {
                System.out.println(Math.abs(D - a));
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input");
        }
    }
}