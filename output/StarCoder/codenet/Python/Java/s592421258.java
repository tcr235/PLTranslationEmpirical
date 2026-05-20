import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String s = input + input;
        System.out.println(input.substring(1).contains(input.substring(0, 1)) ? "Yes" : "No");
        scanner.close();
    }
}