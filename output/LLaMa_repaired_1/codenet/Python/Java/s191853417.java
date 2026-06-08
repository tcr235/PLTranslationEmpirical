import java.util.Scanner;

public class s191853417 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 5 numbers separated by space: ");
        int a = scanner.nextInt();
        scanner.nextInt(); // read and discards the remaining 4 integers
        int b = scanner.nextInt();
        scanner.nextInt();
        int c = scanner.nextInt();
        scanner.nextInt();
        int d = scanner.nextInt();
        scanner.nextInt();
        int e = scanner.nextInt();
        scanner.close();

        System.out.println(15 - a - b - c - d - e);
    }
}