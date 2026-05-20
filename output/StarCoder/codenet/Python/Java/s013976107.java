import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        String S = scanner.next();
        
        if (S.charAt(A) == '-' && !S.contains("-")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}