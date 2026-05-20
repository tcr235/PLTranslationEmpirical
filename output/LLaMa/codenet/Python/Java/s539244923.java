import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            
            if (k % n == 0) {
                System.out.println(k + n);
            } else {
                System.out.println(k - n);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        }
    }
}