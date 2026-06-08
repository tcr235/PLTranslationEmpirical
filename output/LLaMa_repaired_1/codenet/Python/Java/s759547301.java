import java.util.Scanner;

public class s759547301 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the weather condition (Sunny/Cloudy/Rainy): ");
        String S = scanner.nextLine();

        if (S.equals("Sunny")) {
            System.out.println("Cloudy");
        } else if (S.equals("Cloudy")) {
            System.out.println("Rainy");
        } else if (S.equals("Rainy")) {
            System.out.println("Sunny");
        } else {
            System.out.println("Invalid input");
        }
        scanner.close();
    }
}