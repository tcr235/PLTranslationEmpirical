import java.util.Scanner;

public class atcoder_ABC164_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integers (space separated): ");
        int S = scanner.nextInt();
        int W = scanner.nextInt();
        scanner.close();
        System.out.println((S <= W) ? "unsafe" : "safe");
    }
}