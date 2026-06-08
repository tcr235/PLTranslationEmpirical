import java.util.Scanner;

public class codeforces_59_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String txt = scanner.nextLine().trim();
        scanner.close();

        int cu = 0;
        int cl = 0;
        for (char z : txt.toCharArray()) {
            if (Character.isLowerCase(z)) {
                cl++;
            } else if (Character.isUpperCase(z)) { // Check for valid input
                cu++;
            }
        }

        if (cu > cl) {
            System.out.println(txt.toUpperCase());
        } else {
            System.out.println(txt.toLowerCase());
        }
    }
}