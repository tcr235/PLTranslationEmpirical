import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String txt = scanner.nextLine();
        scanner.close();

        int cu = 0;
        int cl = 0;
        for (char z : txt.toCharArray()) {
            if (Character.isLowerCase(z)) {
                cl++;
            } else {
                cu++;
            }
        }

        String out;
        if (cu > cl) {
            out = txt.toUpperCase();
        } else {
            out = txt.toLowerCase();
        }
        System.out.println(out);
    }
}