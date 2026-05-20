import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        if (input.length() == 2) {
            System.out.println(input);
        } else {
            StringBuilder sb = new StringBuilder(input);
            System.out.println(sb.reverse());
        }
    }
}