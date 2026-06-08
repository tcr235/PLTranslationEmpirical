import java.util.Scanner;

public class atcoder_ABC112_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.close();

        if (age == 1) {
            System.out.println("Hello World");
        } else {
            System.out.print("Enter the first number: ");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter the second number: ");
            int b = Integer.parseInt(scanner.nextLine());
            System.out.println(a + b);
        }
    }
}