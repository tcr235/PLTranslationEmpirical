import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] s = scanner.nextLine().toCharArray();
        Arrays.sort(s);
        if (s.length >= 4 && s[0] == s[1] && s[0] != s[2] && s[2] == s[3]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}