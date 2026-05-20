import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three integers separated by space: ");
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(n/(a + b) * a + Math.min(n % (a + b), a));
    }
}