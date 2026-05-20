import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the weather condition (Sunny/Cloudy/Rainy): ");
        String weather = scanner.nextLine();

        switch (weather) {
            case "Sunny":
                System.out.println("Cloudy");
                break;
            case "Cloudy":
                System.out.println("Rainy");
                break;
            case "Rainy":
                System.out.println("Sunny");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
        scanner.close();
    }
}