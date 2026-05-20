import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        String e = " Eve";
        System.out.println("Christmas" + e.repeat(Math.abs(n - 25)));
    }
}