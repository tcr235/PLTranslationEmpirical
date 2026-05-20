import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        int N;
        try {
            N = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("No");
            return;
        }

        if (N == 0) {
            System.out.println("Yes");
        } else {
            int X = 0;
            while (N > 0) {
                X += N % 10;
                N /= 10;
            }
            if (X % 9 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}