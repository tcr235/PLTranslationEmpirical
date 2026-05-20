import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 5 numbers separated by space: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        scanner.close();

        System.out.println(15 - a - b - c - d - e);
    }
}