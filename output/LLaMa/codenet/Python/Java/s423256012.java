import java.util.Scanner;

public class s423256012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        if ((A + B) % 2 == 1) {
            System.out.println("IMPOSSIBLE");
        } else {
            System.out.println((A + B) / 2);
        }
        scanner.close();
    }
}