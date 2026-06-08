import java.util.Arrays;
import java.util.Scanner;

public class s441329208 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine().trim();
        String second = scanner.nextLine().trim();

        String s = first.split("").sort();
        String t = new StringBuilder(second).reverse().toString();
        t = t.split("");

        boolean isEqual = Arrays.equals(s, t);

        System.out.println(isEqual ? "Yes" : "No");
        scanner.close();
    }
}