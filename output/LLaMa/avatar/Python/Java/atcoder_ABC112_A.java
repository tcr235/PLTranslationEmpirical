import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume newline left-over

        if (age == 1) {
            System.out.println("Hello World");
        } else {
            System.out.print("Enter the first number: ");
            int a = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int b = scanner.nextInt();
            System.out.println(a + b);
        }
        scanner.close();
    }
}