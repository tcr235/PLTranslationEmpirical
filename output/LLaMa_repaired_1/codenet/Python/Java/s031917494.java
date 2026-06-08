import java.util.Scanner;

public class s031917494 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        String eve = " Eve";
        String result = "Christmas" +eve.repeat(Math.max(Math.abs(n - 25), 0));
        System.out.println(result);
    }
}