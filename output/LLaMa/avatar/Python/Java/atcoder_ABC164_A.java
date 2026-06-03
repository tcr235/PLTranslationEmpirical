import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integers (space separated): ");
        int S = scanner.nextInt();
        int W = scanner.nextInt();
        scanner.close();
        System.out.println((S <= W) ? "unsafe" : "safe");
    }
}