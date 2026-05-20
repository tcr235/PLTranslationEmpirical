import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        if (N == 0) {
            System.out.println("Yes");
        } else {
            String numStr = Integer.toString(N);
            int[] array = new int[numStr.length()];
            for (int i = 0; i < numStr.length(); i++) {
                array[i] = Character.getNumericValue(numStr.charAt(i));
            }
            int X = 0;
            for (int i : array) {
                X += i;
            }
            if (X % 9 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}