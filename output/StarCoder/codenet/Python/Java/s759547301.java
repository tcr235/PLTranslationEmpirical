import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        if (S.equals("Sunny")) {
            System.out.println("Cloudy");
        } else if (S.equals("Cloudy")) {
            System.out.println("Rainy");
        } else if (S.equals("Rainy")) {
            System.out.println("Sunny");
        }
    }
}