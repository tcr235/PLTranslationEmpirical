import java.util.Scanner;

public class s013976107 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        char[] S = scanner.nextLine().toCharArray();
        
        if (S[A] == '-' && A == B - 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}