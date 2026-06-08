import java.util.Scanner;

public class s423256012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        int sum = A + B;
        int average = sum / 2;
        
        if (sum % 2 == 1) {
            System.out.println("IMPOSSIBLE");
        } else {
            System.out.println(average);
        }
        scanner.close();
    }
}