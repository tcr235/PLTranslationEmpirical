import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        String t = scanner.nextLine().trim().split("")
                [0] != "" ? new StringBuilder(scanner.nextLine().trim()).reverse().toString() : scanner.nextLine().trim();
        System.out.println(Arrays.equals(s.split(""), t.split("")) ? "Yes" : "No");
    }
}