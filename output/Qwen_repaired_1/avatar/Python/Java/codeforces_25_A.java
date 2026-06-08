import java.util.Scanner;

public class codeforces_25_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String[] inputs = scanner.nextLine().split(" ");
        int firstOddIndex = -1;
        boolean foundFirstOdd = false;
        
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(inputs[i]);
            if (x % 2 != 0 && !foundFirstOdd) {
                firstOddIndex = i + 1;
                foundFirstOdd = true;
            }
        }
        
        System.out.println(firstOddIndex);
        
        scanner.close();
    }
}