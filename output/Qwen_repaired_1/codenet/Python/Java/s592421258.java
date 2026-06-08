import java.util.Scanner;

public class s592421258 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next().concat(scanner.next());
        if (input.contains("ace")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scanner.close();
    }
}