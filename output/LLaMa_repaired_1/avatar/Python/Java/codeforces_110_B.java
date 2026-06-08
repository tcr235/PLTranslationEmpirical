import java.util.Scanner;

public class codeforces_110_B {
    public static void main(String[] args) {
        String LUCKY = "abcd";
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < n; i++) {
            s.append(LUCKY.charAt(i % 4));
        }
        System.out.println(s.toString());
    }
}