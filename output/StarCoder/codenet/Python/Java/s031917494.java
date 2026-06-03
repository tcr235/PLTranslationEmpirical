import java.util.Scanner;

public class s031917494 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        String result;
        if (input == 25) {
            result = "Christmas";
        } else {
            result = "Christmas" + " Eve".repeat(Math.abs(input - 25));
        }
        System.out.println(result);
    }
}