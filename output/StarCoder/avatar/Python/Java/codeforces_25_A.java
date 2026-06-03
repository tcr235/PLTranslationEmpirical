import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String[] inputs = scanner.nextLine().split(" ");
        int oddIndex = -1;
        int evenIndex = -1;
        boolean hasOdd = false, hasEven = false;
        
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(inputs[i]);
            if (x % 2 != 0 && !hasOdd) {
                oddIndex = i + 1;
                hasOdd = true;
            } else if (x % 2 == 0 && !hasEven) {
                evenIndex = i + 1;
                hasEven = true;
            }
        }
        
        if (oddIndex != -1) {
            System.out.println(oddIndex);
        } else {
            System.out.println(evenIndex);
        }
        
        scanner.close();
    }
}